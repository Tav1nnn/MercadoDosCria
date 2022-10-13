/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.mercado.servlet;

import br.edu.ifpr.mercado.entities.Usuario;
import br.edu.ifpr.mercado.models.UsuarioModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author otavio
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

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
        String email, senha;

        email = request.getParameter("email");
        senha = request.getParameter("senha");

        UsuarioModel model = new UsuarioModel();

        try {
            Usuario u = model.confirmarLogin(email, senha);
            if (u != null) {

                HttpSession sessao = request.getSession(true);
                sessao.setAttribute("autenticado", true);
                sessao.setAttribute("autenticado", u);

                if (u.getAdm() == true) {
                    response.sendRedirect("MenuAdm");
                    
                } else {
                    if ("s".equals(request.getParameter("manter"))) {
                        Cookie cookie = new Cookie("manterLogado", "manter");
                        cookie.setMaxAge(60 * 60 * 24 * 30);
                        response.addCookie(cookie);
                    }
                    response.sendRedirect("Compra");
                }
            } else {
                response.sendRedirect("Login");
            }
        } catch (Exception e) {
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
