/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.models;

import br.edu.ifpr.mercado.DAOs.CompraDAO;
import br.edu.ifpr.mercado.entities.Compraa;
import br.edu.ifpr.mercado.servlet.Compra;
import java.sql.SQLException;

/**
 *
 * @author otavio
 */
public class CompraModel {
    public void novaCompra(Compraa compra) throws SQLException{
        CompraDAO dao = new CompraDAO();
        dao.novaCompra(compra);

    }
    
    public Compraa compraID() throws SQLException{
        CompraDAO dao = new CompraDAO();
        Compraa compra = dao.compraId();
        System.out.println("model"+compra.getId());
        return compra;
    }

   
}
