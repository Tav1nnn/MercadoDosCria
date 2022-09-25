<%-- 
    Document   : loginadm
    Created on : 21/09/2022, 15:47:14
    Author     : otavio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login adm</title>

        <style>
            *{
                padding: 0;
                margin: 0;
                background-color: rgb(35, 31, 31);

            }
            #container{
                width: 100vh;
                max-width: 600px;
                height: 100vh;
            }
            #imgCarrinho{
                width: 30vh;
                height: 30vh;
            }
            .center{
                display: flex;
                align-items: center;
                justify-content: center;
                flex-direction: column;
            }
            
            form{
                padding-top: 50px;
            }

            input{
                border: none;
                padding: 12px 15px;
                margin: 8px 0;
                width: 50vh;
                border: 1px solid white;
                color: white;

            }
            .btn{
                width: 25vh;
                
            }
            .btn:hover{
                background: white;
                color: black;
            }
        </style>
    </head>
    <body>
        <div class="center">
            <section id="container" class="center">

                <img src="img/carrinhocompra.png" alt="alt" id="imgCarrinho">

                <form action="Login" method="post" class="center">
                    <input type="email" name="email" placeholder="Email">
                    <input type="password" name="senha" placeholder="Senha">
                    <input type="submit" name="btn" value="Entrar" class="btn">
                </form>
               
                <a href="Cadastro" style="color: white">Cadastrar-se</a>
            </section>
        </div>
    </body>
</html>
