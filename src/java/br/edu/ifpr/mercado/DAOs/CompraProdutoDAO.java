/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.DAOs;

import br.edu.ifpr.mercado.entities.CompraProduto;
import br.edu.ifpr.mercado.factories.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author otavio
 */
public class CompraProdutoDAO {

    public void add(ArrayList<CompraProduto> arraycp) throws SQLException {
        String sql = "INSERT INTO COMPRA_PRODUTO (QUANTIDADE, ID_COMPRA, ID_PRODUTO) VALUES (? , ? , ?)";
        Connection connection = new ConnectionFactory().getConnection();
        PreparedStatement stmt = connection.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        for (CompraProduto array : arraycp) {

            stmt.setInt(1, array.getQuantidade());
            stmt.setInt(2, array.getIdCompra());
            stmt.setInt(3, array.getIdProduto());

            stmt.execute();
            stmt.close();
            connection.close();
        }
    }
}
