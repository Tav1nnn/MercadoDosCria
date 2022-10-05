<%-- 
    Document   : listaProdutos
    Created on : 28/09/2022, 13:59:55
    Author     : otavio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"
          prefix="c" %>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/listaProdutos"/>
         <script src="https://kit.fontawesome.com/f9c75e61f8.js" crossorigin="anonymous"></script>
         <link rel="stylesheet" href="css/listaProdutos.css"/>
    </head>
    <body>
        <section class="container">
            <h1>Lista de Produtos</h1>
            <table class="ex">
                <tr>
                
                    <th>#</th>
                    <th>Nome</th>
                    <th>Descrição</th>
                    <th>Quantidade</th>
                    <th>Preço</th>
                    <th>Fornecedor</th>
                    <th>#</th>
                    <th>#</th>
                    
                </tr>

                <c:forEach varStatus="status" var="model" items="${produtos}">
                    <tr>
                        <td>${status.index + 1}</td>
                        <td class="nome">${model.nome}</td>
                        <td class="descricao">${model.descricao}</td>
                        <td class="nome">${model.quantidade}</td>
                        <td class="nome">${model.preco}</td>
                        <td class="nome">${model.fornecedor}</td>
                        <td class="icon"><a href="EditarProduto?indice=${model.id}"><i class="fa-solid fa-pencil"></a></i></td>
                        <td class="icon"><a href="url"><i class="fa-solid fa-trash-can"></a></i></td>
                    </tr>
                </c:forEach>

            </table>
        </section>
    </body>
</html>
