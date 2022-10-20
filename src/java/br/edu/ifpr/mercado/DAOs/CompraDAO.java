/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.DAOs;

import br.edu.ifpr.mercado.entities.Compraa;
import br.edu.ifpr.mercado.factories.ConnectionFactory;
import br.edu.ifpr.mercado.servlet.Compra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author otavio
 */
public class CompraDAO {

    public void novaCompra(Compraa compra) throws SQLException {
        String sql = "INSERT INTO COMPRA (endereco, id_usuarios) VALUES (?, ?)";
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, compra.getEndereco());
        stmt.setInt(2, compra.getIdUsuario());

        stmt.execute();
        stmt.close();
        connection.close();
    }
    
   public Compraa compraId() throws SQLException{
       String sql = "SELECT ID, ENDERECO, ID_USUARIOS FROM COMPRA ORDER BY ID DESC ";
       Connection connection = new ConnectionFactory().getConnection();
       PreparedStatement stmt = connection.prepareStatement(sql);
       
        ResultSet rs = stmt.executeQuery();
        Compraa compra = null;
        if(rs.next()){
            int id = rs.getInt("ID");
            String endereco = rs.getString("ENDERECO");
            int idUsuario = rs.getInt("ID_USUARIOS");
            
            compra = new Compraa(id, endereco, idUsuario);
        }
       connection.close();
       return compra;
   }
}
