<%-- 
    Document   : header
    Created on : 26/10/2022, 07:09:20
    Author     : otavio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/compra"/>
    </head>
    <body>
        <header>
                <div class="name">
                    <h1>Mercado Dos Crias</h1>
                    <img src="img/carrinhocompra.png" alt="alt"/>
                </div>
                <div class="linha2"></div>
                <div class="user">
                    <p>${usuario.nome}</p>
                    <a href="Sair">
                       Sair
                    </a>
                </div>

            </header>
    </body>
</html>
