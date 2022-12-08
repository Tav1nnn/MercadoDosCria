/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.mercado.servlet;

import CustomExceptions.ParameterException;
import br.edu.ifpr.mercado.entities.Usuario;
import br.edu.ifpr.mercado.models.UsuarioModel;
import com.google.gson.Gson;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author otavio
 */
@WebServlet(name = "LoginAjax", urlPatterns = {"/LoginAjax"})
@MultipartConfig
public class LoginAjax extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("WEB-INF/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=UTF-8");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        UsuarioModel model = new UsuarioModel();

        try {
            Usuario u = model.autenticar(email, senha);

            if (u == null) {
                Gson gsonParser = new Gson();
                try ( PrintWriter out = response.getWriter()) {
                    out.print(gsonParser.toJson(new Errors.Error(403, "Usuário/senha inválidos")));
                }
            } else {
                HttpSession sessao = request.getSession(true);
                sessao.setAttribute("autenticado", true);
                sessao.setAttribute("autenticado", u);
                Gson gsonParser = new Gson();
                try ( PrintWriter out = response.getWriter()) {
                    out.print(gsonParser.toJson(u));
                }
            }
        } catch (ParameterException p) {
            Gson gsonParser = new Gson();
            try ( PrintWriter out = response.getWriter()) {
                out.print(gsonParser.toJson(new Errors.Error(400, p.getMessage())));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginAjax.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
