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
        <style>
            *{
                padding: 0;
                margin: 0;

            }

            .container{
                display: flex;
                align-items: center;
                justify-content: center;
                flex-direction: column;
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

            input{
                border: none;
                padding: 12px 15px;
                margin: 8px 0;
                width: 300px;
                border: 1px solid white;
                color: white;
                background: transparent;
            }
            .btn{
                margin-top: 15px;
                width: 130px;
                border-radius: 10px;
                border: 1.5px solid white;
                font-size: 14px;
                font-weight: 600;
            }
            .btn:hover{
                background: white;
                color: black;
            }
            .centerr{
                display: flex;
                justify-content: center;
                align-items: center;
                margin-right: 35px;
            }
            .escolherArquivo{
                 border: 0px solid white;
            }
            h1{
                color: white;
                margin: 0px 0px 15px 17px;
                font-family: 'roboto';
            }
            form{
                display: flex;
                flex-direction: column;
            }
            input[type="file"]{display: none;}
            label{
                display: flex;
                align-items: center;
                justify-content: center;
                margin-top: 7px;
                color: black;
                background: lightgray;
                width: 140px;
                height: 20px;
                cursor: pointer;
            }
            i{
                margin: 0px 0px 0px 5px;
            }
        </style>
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
