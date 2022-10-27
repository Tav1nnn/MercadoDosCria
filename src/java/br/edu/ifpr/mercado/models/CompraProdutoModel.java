/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.models;

import br.edu.ifpr.mercado.DAOs.CompraProdutoDAO;
import br.edu.ifpr.mercado.entities.CompraProduto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author otavio
 */
public class CompraProdutoModel {
    public void add(ArrayList<CompraProduto> arraycp) throws SQLException{
        CompraProdutoDAO dao = new CompraProdutoDAO();
        dao.add(arraycp);
    }
}
