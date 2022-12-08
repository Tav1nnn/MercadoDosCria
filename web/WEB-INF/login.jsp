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
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login adm</title>
        <link rel="stylesheet" href="css/login.css"/>
    </head>
    <body>
        <div class="center">
            <section id="container" class="center">

                <img src="img/carrinhocompra.png" alt="alt" id="imgCarrinho">

                <form action="LoginAjax" class="center" id="form" onsubmit="logar(event)" >
                    <input type="email" name="email" placeholder="Email">
                    <input type="password" name="senha" placeholder="Senha">
                    <input type="submit" name="btn" value="Entrar" class="btn">
                    <script src="assincrono.js" ></script>
                    <p>
                        <label class="" for="manter" style="color: white; text-decoration: underline;">Manter-me Logado</label>
                        <input type="checkbox" name="manter" value="s" id="manter"/>                    
                    </p>
                </form>

                <a href="Cadastro" style="color: white;">Cadastrar-se</a>
            </section>
        </div>
    </body>
</html>
