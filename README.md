# DESAFIO: MovieFlix - Backend

# Sobre o projeto

### Premissas

- É um sistema que possui um modelo de domínio relativamente simples,
porém abrangente, ou seja, que explore vários tipos de relacionamentos entre as
entidades de negócio (muitos-para-um, muitos-para-muitos, etc.).
- O sistema possibilita a aplicação de vários conhecimentos importantes das
disciplinas de fundamentos.
- O sistema contem as principais funcionalidades que se espera de um
profissional iniciante deve saber construir.


## 

### Visão geral do Desafio

#### Sistema consiste em aplicar as seguintes funcionalidades de acordo com o TDD(Desenvolvimento Orientado por Testes):

- GET /genres deve retornar 401 para token inválido

- GET /genres deve retonar 200 com todos gêneros para VISITOR logado

- GET /genres deve retonar 200 com todos gêneros para MEMBER logado

- GET /movies/{id} deve retornar 401 para token inválido

- GET /movies/{id} deve retornar 200 com o filme para VISITOR logado

- GET /movies/{id} deve retornar 200 com o filme para MEMBER logado

- GET /movies/{id} deve retornar 404 para id inexistente

- GET /movies deve retornar 401 para token inválido

- GET /movies deve retornar 200 com página ordenada de filmes para VISITOR logado

- GET /movies deve retornar 200 com página ordenada de filmes para MEMBER logado

- GET /movies?genreId={id} deve retornar 200 com página ordenada de filmes filtrados por gênero

- POST /reviews deve retornar 401 para token inválido

- POST /reviews deve retornar 403 para VISITOR logado

- POST /reviews deve retornar 201 com objeto inserido para MEMBER logado e dados válidos

- POST /reviews deve retornar 422 para MEMBER logado e dados inválidos

#### Seguindo esté protótipo de tela:

https://www.figma.com/file/6JQVnxKgKtVHLleSBBgRin/MovieFlix-front-listagem
##

### Respeitando o seguinte Modelo Conceitual:

![image](https://github.com/PauloSergioo/Desafio-MovieFlix/assets/88008441/fefa4dda-2d03-4c61-8f48-91fe42a1f27c)


# Educador

[DevSuperior - Escola de programação](https://devsuperior.com.br/)

[![DevSuperior no Instagram](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/ig-icon.png)](https://instagram.com/devsuperior.ig) ![DevSuperior no Youtube](https://raw.githubusercontent.com/devsuperior/bds-assets/main/ds/yt-icon.png)
