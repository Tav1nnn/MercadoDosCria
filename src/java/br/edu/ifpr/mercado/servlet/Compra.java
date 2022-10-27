/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.mercado.servlet;

import br.edu.ifpr.mercado.Helpers.Helper;
import br.edu.ifpr.mercado.entities.CompraProduto;
import br.edu.ifpr.mercado.entities.Compraa;
import br.edu.ifpr.mercado.entities.Produto;
import br.edu.ifpr.mercado.entities.Usuario;
import br.edu.ifpr.mercado.models.CompraModel;
import br.edu.ifpr.mercado.models.CompraProdutoModel;
import br.edu.ifpr.mercado.models.ProdutoModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author otavio
 */
@WebServlet(name = "Compra", urlPatterns = {"/Compra"})
public class Compra extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sessao = request.getSession(false);

        ProdutoModel model = new ProdutoModel();

        ArrayList<Produto> produtos;
        try {
            Usuario u = (Usuario) sessao.getAttribute("autenticado");
            request.setAttribute("usuario", u);
            produtos = model.listar();
            request.setAttribute("produtos", produtos);
            request.getRequestDispatcher("WEB-INF/compra.jsp").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sessao = request.getSession(false);
        Usuario u = (Usuario) sessao.getAttribute("autenticado");

        String endereco = request.getParameter("endereco");
        int idUsuario = u.getId();
        CompraModel model = new CompraModel();

        Compraa compra = new Compraa(endereco, idUsuario);

        try {
            model.novaCompra(compra);

            Compraa novaCompra = model.compraID();
            System.out.println("serblet" + novaCompra.getId());
            Enumeration<String> parametros = request.getParameterNames();

            ArrayList<CompraProduto> arraycp = new ArrayList();
            int contador = 0;
           /* while (parametros.hasMoreElements()) {

                String nomeParametro = parametros.nextElement();

                Integer idProduto = Helper.stringToInt(nomeParametro);

               if (idProduto != null && request.getParameter(nomeParametro) != null) {

                    int quantidade = Integer.parseInt(request.getParameter(nomeParametro));
                    int idCompra = novaCompra.getId();
                    
              
                    CompraProduto cp = new CompraProduto(quantidade, idCompra, idProduto);
                    
                    System.out.println(cp);
                    arraycp.add(cp);
                    
                    

                }

            }*/
           request.getRequestDispatcher("WEB-INF/sucesso.jsp").forward(request, response);
            
        } catch (SQLException ex) {
            Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
