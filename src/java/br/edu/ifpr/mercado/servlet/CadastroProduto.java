/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.mercado.servlet;

import br.edu.ifpr.mercado.entities.Produto;
import br.edu.ifpr.mercado.models.ProdutoModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author otavio
 */
@WebServlet(name = "CadastroProduto", urlPatterns = {"/CadastroProduto"})
@MultipartConfig(maxFileSize = 8 * 1024 * 1024 * 5/*5MB*/)
public class CadastroProduto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/cadastroProduto.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        int quantidade = Integer.parseInt(request.getParameter("qtd"));
        int preco = Integer.parseInt(request.getParameter("preco"));
        String fornecedor = request.getParameter("fornecedor");
        Part part = request.getPart("img");
        String contentType = part.getContentType();
        
        byte[] imagem = new byte[part.getInputStream().available()];
        part.getInputStream().read(imagem);
        
        Produto p = new Produto(nome, descricao, quantidade, preco, fornecedor, imagem, contentType);
        ProdutoModel model = new ProdutoModel();
        
        try {
            model.add(p);
            response.sendRedirect("MenuAdm");
        } catch (Exception e) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
