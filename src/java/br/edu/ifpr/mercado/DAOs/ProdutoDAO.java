/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.DAOs;

import br.edu.ifpr.mercado.entities.Produto;
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
public class ProdutoDAO {

    public void add(Produto p) throws SQLException {
        String sql = "INSERT INTO PRODUTO (nome, descricao, quantidade, preco, fornecedor, imagem, imagemtipo)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
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

    public ArrayList listar() throws SQLException {
        String sql = "SELECT ID, NOME, DESCRICAO, QUANTIDADE, PRECO, FORNECEDOR FROM PRODUTO";//talvez de errado

        ArrayList<Produto> produtos = new ArrayList();

        Connection conexao = new ConnectionFactory().getConnection();
        PreparedStatement stmt = conexao.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Produto p = new Produto();
            p.setId(rs.getInt("ID"));
            p.setNome(rs.getString("NOME"));
            p.setDescricao(rs.getString("DESCRICAO"));
            p.setQuantidade(rs.getInt("QUANTIDADE"));
            p.setPreco(rs.getInt("PRECO"));
            p.setFornecedor(rs.getString("FORNECEDOR"));
            
            produtos.add(p);
        }
        
        conexao.close();
        return produtos;

    }

}
