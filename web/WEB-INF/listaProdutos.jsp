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
        <div class="container">

            <ul class="responsive-table">
                <li class="table-header">
                    <div class="col col-1">#</div>
                    <div class="col col-2">Nome</div>
                    <div class="col col-3">Descrição</div>
                    <div class="col col-4">Qtd</div>
                    <div class="col col-5">Preço</div>
                    <div class="col col-6">Fornecedor</div>
                    <div class="col col-7">#</div>
                    <div class="col col-8">#</div>
                </li>
                <c:forEach varStatus="status" var="model" items="${produtos}">
                    <li class="table-row">
                        <div class="col col-1" data-label="Job Id">${status.index + 1}</div>
                        <div class="col col-2" data-label="Customer Name">${model.nome}</div>
                        <div class="col col-3" data-label="Amount">${model.descricao}</div>
                        <div class="col col-4" data-label="Payment Status">${model.quantidade}</div>
                        <div class="col col-5" data-label="Payment Status">${model.preco}</div>
                        <div class="col col-6" data-label="Payment Status">${model.fornecedor}</div>
                        <div class="col col-7" data-label="Payment Status"><a href="EditarProduto?indice=${model.id}"><i class="fa-solid fa-pencil"></a></i></div>
                        <div class="col col-8" data-label="Payment Status"><a href="ExcluirProduto?indice=${model.id}"><i class="fa-solid fa-trash-can"></a></i></div>
                    </li>

                </c:forEach>
            </ul>
        </div>
      
    </body>
</html>
