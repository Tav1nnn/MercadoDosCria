<%-- 
    Document   : menuAdm
    Created on : 23/09/2022, 14:25:59
    Author     : otavio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Produto</title>
         <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet'>
         <link rel="stylesheet" href="css/cadastroProduto.css"/>
        <script src="https://kit.fontawesome.com/f9c75e61f8.js" crossorigin="anonymous"></script>
    </head>
    <body>
        
        <section class="container" style="">
            
            
            <div class="box"> 
                <div class="center"><h1>Cadastrar Produto</h1><img src="img/carrinhocompra.png" alt="alt" height="230px" width="230px" class="img"/></div>

                <div class="menu">
                    <form action="CadastroProduto" method="post" enctype="multipart/form-data">
                        <input type="text" name="nome" placeholder="Nome">
                        <input type="textarea" name="descricao" placeholder="Descrição">
                        <input type="number" name="qtd" placeholder="Quantidade">
                        <input type="number" name="preco" placeholder="Preço">
                        <input type="text" name="fornecedor" placeholder="Fornecedor">
                        <label for="file">Foto do Produto <i class="fa-solid fa-image"></i></label>
                        <input type="file" name="img" id="file" class="escolherArquivo">
                        <div class="centerr"><input type="submit" name="" value="Cadastrar" class="btn"></div>
                        
                    </form>
                </div>
            </div>
        </section>
        
    </body>
</html>
