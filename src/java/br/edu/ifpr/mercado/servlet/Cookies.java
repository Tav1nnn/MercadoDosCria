/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package br.edu.ifpr.mercado.servlet;

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
@WebServlet(name = "Cookies", urlPatterns = {"/Cookies"})
public class Cookies extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         HttpSession sessao = request.getSession(false);

        if (sessao != null && sessao.getAttribute("autenticado") != null
                && (boolean) sessao.getAttribute("autenticado") == true) {
            response.sendRedirect("Compra");
        } else {
            Cookie[] cookies = request.getCookies();
            boolean passouCookie = false;
            
            if (cookies != null) {
                for (Cookie cookie : cookies) {
                    if ("manterLogado".equals(cookie.getName())) {
                        sessao = request.getSession(true);
                        sessao.setAttribute("autenticado", true);
                        response.sendRedirect("Compra");
                        passouCookie = true;
                        break;
                    }
                }
            }
            if(!passouCookie)
                response.sendRedirect("Login");
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
