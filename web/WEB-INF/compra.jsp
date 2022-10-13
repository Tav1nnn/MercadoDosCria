<%-- 
    Document   : compra
    Created on : 11/10/2022, 08:23:12
    Author     : otavio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compra</title>
        <link rel="stylesheet" href="css/compra.css"/>
    </head>
    <body>
        <section class="container">
            <header>
                <div class="name">
                    <h1>Mercado Dos Crias</h1>
                    <img src="img/carrinhocompra.png" alt="alt"/>
                </div>
                <div class="linha2"></div>
                <div class="user">

                </div>

            </header>

        </div>
        <form action="action" method="post">
            <c:forEach varStatus="status" var="model" items="${produtos}">
                <div class="produtos">
                    <div class="cheeckbox">
                        <input type="checkbox">
                    </div>
                    <div class="linha"></div>
                    <div class="img">
                        <img src="MostrarImg?id=${model.id}" alt="alt"/>
                    </div>
                    <div class="descricao">
                        <ul>
                            <li>Nome: ${model.nome}</li>
                            <li>Descrição: ${model.descricao}</li>
                            <li>Preço: ${model.preco}</li>
                        </ul>
                    </div>
                    <div class="quantidade">
                        <input type="number" max="${model.quantidade}" min="1">
                    </div>
                </div>  
            </c:forEach>
            <input type="submit" name="name">
        </form>
    </section>
</body>
</html>
