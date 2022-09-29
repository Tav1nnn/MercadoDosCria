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
        <title>JSP Page</title>
        <link href='https://fonts.googleapis.com/css?family=Roboto' rel='stylesheet'>
        <style>
            *{
                padding: 0;
                margin: 0;

            }

            .container{
                display: flex;
                align-items: center;
                justify-content: center;
                width: 100vw;
                height: 100vh;
                background: -webkit-linear-gradient(-1409deg, #fb2424, #ffc42e);
            }
            .box{
                width: 50%;
                height: 70%;
                background-color:rgb(35, 31, 31);
                border-radius: 15px;
            }

            .img{
                background: transparent;
            }
            .center{
                float: left;
                background: transparent;
                padding: 130px 0px 0px 80px;
            }

            .menu{
                margin-top: 75px;
                width: 50%;
                height: 70%;
                background: transparent;
                float: right;
                flex-direction: column;
                display: flex;
                align-items: center;
                justify-content: center;
            }
            a{
                background: transparent;
                text-decoration: none;
                color: white;
                border: 2px solid red;
                margin: 10px;
                width: 200px;
                height: 40px;
                display: flex;
                align-items: center;
                justify-content: center;
                font-family: arial;
                font-size: 16px;
            }
            a:hover{
                background: red;
            }
            h1{
                color: white;
                margin: 0px 0px 15px 0px;
                font-family: 'roboto';
            }
        </style>

    </head>
    <body>
        <section class="container" style="">
            <div class="box"> 
                <div class="center"><h1>Menu do Adiministrador</h1><img src="img/carrinhocompra.png" alt="alt" height="230px" width="230px" class="img"/></div>

                <div class="menu">
                    <a href="CadastroProduto">Novo Produto</a>
                    <a href="url">Remover Produto</a>
                    <a href="ListarProdutos">Atualizar Produtos</a>
                    <a href="url">Relatorio de Estoque</a>
                    <a href="url">Voltar</a>
                    
                </div>
            </div>
        </section>
    </body>
</html>
