/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.models;

import br.edu.ifpr.mercado.DAOs.ProdutoDAO;
import br.edu.ifpr.mercado.entities.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author otavio
 */
public class ProdutoModel {
    public void add(Produto p) throws SQLException{
        ProdutoDAO dao = new ProdutoDAO();
        dao.add(p);
    }
    
    public ArrayList listar() throws SQLException{
        ProdutoDAO dao = new ProdutoDAO();
         return dao.listar();
    }
    
    public Produto buscarIndex(int index) throws SQLException{
        ProdutoDAO dao = new ProdutoDAO();
        Produto p = dao.buscarIndex(index);
        return p;
    }
}
