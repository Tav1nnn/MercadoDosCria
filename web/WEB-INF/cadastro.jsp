
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
        <link rel="stylesheet" href="css/cadastro.css"/>
    </head>
    <body>
        <div class="center">
            <section id="container" class="center">

                <img src="img/carrinhocompra.png" alt="alt" id="imgCarrinho">

                <form action="Cadastro" method="post" class="center">
                    <input type="text" name="nome" placeholder="Nome">
                    <input type="email" name="email" placeholder="Email">
                    <input type="password" name="senha" placeholder="Senha">
                    <input type="password" name="confirmarSenha" placeholder="Confirmar Senha">
                    <input type="submit" name="btn" value="Cadastrar" class="btn">
                </form>
               
            </section>
        </div>
    </body>
</html>
