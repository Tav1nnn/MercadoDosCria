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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author otavio
 */
@WebServlet(name = "MostrarImg", urlPatterns = {"/MostrarImg"})
public class MostrarImg extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ProdutoModel model = new ProdutoModel();
        
        int id = Integer.parseInt(request.getParameter("id"));      
        try {
            Produto p = model.buscarIndex(id);
            
            response.getOutputStream().write(p.getImagem());
            response.setContentType(p.getImagemtipo());
        } catch (SQLException ex) {
            Logger.getLogger(MostrarImg.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
