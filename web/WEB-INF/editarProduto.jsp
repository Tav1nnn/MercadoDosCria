<%-- 
    Document   : editarProduto
    Created on : 28/09/2022, 14:00:14
    Author     : otavio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar ${p.nome}</title>
        <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet'>
        <link rel="stylesheet" href="css/cadastroProduto.css"/>
        <script src="https://kit.fontawesome.com/f9c75e61f8.js" crossorigin="anonymous"></script>
        
    </head>
    <body>
        <section class="container" style="">
            <div class="box"> 
                <div class="center"><h1>Editar Produto</h1><img src="img/carrinhocompra.png" alt="alt" height="230px" width="230px" class="img"/></div>

                <div class="menu">
                    <form action="Editar" method="post" enctype="multipart/form-data">
                        <input type="number" name="id" value="${p.id}">
                        <input type="text" name="nome" placeholder="Nome" value="${p.nome}">
                        <input type="textarea" name="descricao" placeholder="Descrição" value="${p.descricao}">
                        <input type="number" name="quantidade" placeholder="Quantidade" value="${p.quantidade}">
                        <input type="number" name="preco" placeholder="Preço" value="${p.preco}">
                        <input type="text" name="fornecedor" placeholder="Fornecedor" value="${p.fornecedor}">
                        <label for="file">Foto do Produto <i class="fa-solid fa-image"></i></label>
                        <input type="file" name="img" id="file" class="escolherArquivo" >
                        <div class="centerr"><input type="submit" name="" value="Cadastrar" class="btn"></div>
                    </form>
                </div>
            </div>
        </section>

    </body>
</html>
