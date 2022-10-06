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

CREATE TABLE compra(
    id INT NOT NULL PRIMARY KEY GENERATED ALWAYS
        AS IDENTITY (START WITH 1, increment by 1),
    preco int NOT NULL,
    endereco varchar(200) NOT NULL,
    id_Usuarios int NOT NULL,
    CONSTRAINT fk_compra_usuarios_id FOREIGN KEY (id_Usuarios) REFERENCES Usuarios(id) 
);

CREATE TABLE compra_produto(
    quantidade int NOT NULL,
    id_Compra int NOT NULL,
    id_Produto int NOT NULL,
    CONSTRAINT fk_compra_id FOREIGN KEY (id_Compra) REFERENCES Compra(id),
    CONSTRAINT fk_produto_id FOREIGN KEY (id_Produto) REFERENCES produto(id)
);