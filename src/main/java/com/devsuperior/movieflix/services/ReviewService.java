package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dto.MovieDetailsDTO;
import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public ReviewDTO insert(ReviewDTO dto) {
        Review entity = new Review();
        User user = new User();
        user = authService.authenticated();
        copyEntityToDTO(user, entity, dto);
        entity = repository.save(entity);
        return new ReviewDTO(entity);

    }

    @Transactional(readOnly = true)
    public List<ReviewDTO> findReview(Long id) {
        List<Review> result = repository.findReview(id);
        return result.stream().map(ReviewDTO::new).collect(Collectors.toList());
    }

    public void copyEntityToDTO(User user, Review entity, ReviewDTO dto) {

        entity.setText(dto.getText());

        Movie movie = movieRepository.getReferenceById(dto.getMovieId());
        entity.setMovie(movie);

        user.setId(userService.getProfile().getId());
        user.setName(userService.getProfile().getName());
        user.setEmail(userService.getProfile().getEmail());
        entity.setUser(user);
    }
}
