/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Filter.java to edit this template
 */
package br.edu.ifpr.mercado.filters;

import br.edu.ifpr.mercado.entities.Usuario;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author otavio
 */
@WebFilter(filterName = "AdmFilter", servletNames = {"MenuAdm", "CadastroProduto", "ListarProduto", "ExcluirProduto", "EditarProduto"})
public class AdmFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession sessao = request.getSession(false);

        if (sessao != null && sessao.getAttribute("autenticado") != null) {
            Usuario u = (Usuario) sessao.getAttribute("autenticado");
            if (u.getAdm() == true) {
                chain.doFilter(request, response);
            }else{
                response.sendRedirect("Login");
            }
        } else {
            response.sendRedirect("Login");
        }

    }

}
