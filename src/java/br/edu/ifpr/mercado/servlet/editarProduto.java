/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.mercado.servlet;

import br.edu.ifpr.mercado.entities.Produto;
import br.edu.ifpr.mercado.models.ProdutoModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "EditarProduto", urlPatterns = {"/EditarProduto"})
@MultipartConfig(maxFileSize = 8 * 1024 * 1024 * 5/*5MB*/)
public class EditarProduto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         int index = Integer.parseInt(request.getParameter("indice"));

        ProdutoModel model = new ProdutoModel();

        try {
            Produto p = model.buscarIndex(index);
            request.setAttribute("p", p);
            request.getRequestDispatcher("WEB-INF/editarProduto.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(EditarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        String nome = request.getParameter("nome");
        String descricao = request.getParameter("descricao");
        int quantidade = Integer.parseInt(request.getParameter("quantidade"));
        int preco = Integer.parseInt(request.getParameter("preco"));
        String fornecedor = request.getParameter("fornecedor");
        Part part = request.getPart("img");
        String contentType = part.getContentType();
        
        byte[] imagem = new byte[part.getInputStream().available()];
        part.getInputStream().read(imagem);
        
        Produto p = new Produto(id, nome, descricao, quantidade, preco, fornecedor, imagem, contentType);
        ProdutoModel model = new ProdutoModel();
        
        try {
            model.editar(p);
            response.sendRedirect("MenuAdm");
        } catch (SQLException ex) {
            Logger.getLogger(EditarProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
