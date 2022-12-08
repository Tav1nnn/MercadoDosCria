/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.models;

import CustomExceptions.ParameterException;
import br.edu.ifpr.mercado.DAOs.UsuarioDAO;
import br.edu.ifpr.mercado.entities.Usuario;
import java.sql.SQLException;

/**
 *
 * @author otavio
 */
public class UsuarioModel {

    public boolean confirmarSenha(String senha, String confirmarSenha) {
        if (senha.equals(confirmarSenha)) {
            return true;
        } else {
            return false;
        }
    }

    public Usuario autenticar(String email, String senha) throws ParameterException, SQLException {
        if (email == null || "".equals(email.trim())) {
            throw new ParameterException("Email obrigatório");
        } else if (senha == null || "".equals(senha.trim())) {
            throw new ParameterException("Senha obrigatório");
        }

        /*if(email.equals("luis@luis.com") && senha.equals("123")){
            return new Usuario("luis@luis.com", "123");
        }*/
        if (email != null && senha != null) {
            UsuarioDAO dao = new UsuarioDAO();
            Usuario u = dao.confirmarLogin(email, senha);
            return u;
        }
        return null;
    }

    public void add(Usuario u) throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        dao.add(u);
    }

    public Usuario confirmarLogin(String email, String senha) throws SQLException {
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.confirmarLogin(email, senha);
        return u;
    }
}
