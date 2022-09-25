/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.models;

import br.edu.ifpr.mercado.DAOs.UsuarioDAO;
import br.edu.ifpr.mercado.entities.Usuario;
import java.sql.SQLException;

/**
 *
 * @author otavio
 */
public class UsuarioModel {
    
    public boolean confirmarSenha(String senha, String confirmarSenha){
        if(senha.equals(confirmarSenha)){
            return true;
        }else{
            return false;
        } 
    }
    
    public void add(Usuario u) throws SQLException{
        UsuarioDAO dao = new UsuarioDAO();
        dao.add(u);
    }
    
    public Usuario confirmarLogin(String email, String senha) throws SQLException{
        UsuarioDAO dao = new UsuarioDAO();
        Usuario u = dao.confirmarLogin(email, senha);     
        return u;
    }
}
