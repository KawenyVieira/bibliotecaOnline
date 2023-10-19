## Saiba mais sobre o projeto
RESTful API para wishList
O objetivo é realizar a integracao para uma pagina de wish list de livros de uma biblioteca online
<div align="center">
  
<img src= "https://github.com/KawenyVieira/bibliotecaOnline/assets/105323660/40647873-98dd-4551-bbb2-d60664ed8189" width= "400px"/>

</div>

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class User {
    -String name
    -Share[] share
    -Feature[] features
    -News[] news
  }

  class Share {
    -String icon
    -String description
  }

  class Feature {
    -String icon
    -String description
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Share
  User "1" *-- "N" Feature
  User "1" *-- "N" News
```
