CREATE TABLE Usuarios(
    id INT NOT NULL PRIMARY KEY GENERATED ALWAYS 
        AS IDENTITY (START WITH 1, increment by 1),
    nome varchar(200) NOT NULL,
    email varchar(200) NOT NULL,
    senha varchar(200) NOT NULL,
    adm boolean
);

CREATE TABLE produto(
    id INT NOT NULL PRIMARY KEY GENERATED ALWAYS  
        AS IDENTITY (START WITH 1, increment by 1),
    nome varchar(200) NOT NULL,
    descricao varchar(500) NOT NULL,
    quantidade int NOT NULL,
    preco int NOT NULL,
    fornecedor varchar(200) NOT NULL,
    imagem blob(5M) NOT NULL,
    imagemtipo varchar(200) NOT NULL
);