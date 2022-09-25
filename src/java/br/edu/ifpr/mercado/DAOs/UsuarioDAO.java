/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.DAOs;

import br.edu.ifpr.mercado.entities.Usuario;
import br.edu.ifpr.mercado.factories.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author otavio
 */
public class UsuarioDAO {

    public void add(Usuario u) throws SQLException {
        String sql = "INSERT INTO USUARIOS (nome, email, senha, adm) VALUES (?, ?, ?, ?)";
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);

        System.out.println(u.getNome());

        stmt.setString(1, u.getNome());
        stmt.setString(2, u.getEmail());
        stmt.setString(3, u.getSenha());
        stmt.setBoolean(4, false);

        stmt.execute();
        stmt.close();
        connection.close();
    }

    public Usuario confirmarLogin(String email, String senha) throws SQLException {
        Usuario u = null;
        boolean adm = false;

        String sql = "SELECT NOME, EMAIL, SENHA, ADM FROM USUARIOS WHERE EMAIL = ? AND SENHA = ?";//talvez de errado
        Connection conexao = new ConnectionFactory().getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setString(1, email);
        stmt.setString(2, senha);
        
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            u = new Usuario();
            u.setEmail(rs.getString("EMAIL"));
            u.setSenha(rs.getString("SENHA"));
            u.setNome(rs.getString("NOME"));
            u.setAdm(rs.getBoolean("ADM"));
        }
        stmt.close();
        conexao.close();
        return u;
    }
}
