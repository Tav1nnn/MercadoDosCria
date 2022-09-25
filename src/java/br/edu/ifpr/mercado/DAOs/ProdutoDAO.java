/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.DAOs;

import br.edu.ifpr.mercado.entities.Produto;
import br.edu.ifpr.mercado.factories.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author otavio
 */
public class ProdutoDAO {

    public void add(Produto p) throws SQLException {
       String sql = "INSERT INTO PRODUTO (nome, descricao, quantidade, preco, fornecedor, imagem, imagemtipo)"
               +"VALUES (?, ?, ?, ?, ?, ?, ?)";
       Connection connection = new ConnectionFactory().getConnection();
       PreparedStatement stmt = connection.prepareStatement(sql);
       
       stmt.setString(1, p.getNome());
       stmt.setString(2, p.getDescricao());
       stmt.setInt(3, p.getQuantidade());
       stmt.setInt(4, p.getPreco());
       stmt.setString(5, p.getFornecedor());
       stmt.setBytes(6, p.getImagem());
       stmt.setString(7, p.getImagemtipo());
       
        stmt.execute();
        stmt.close();
        connection.close();
       
    }
    
}
