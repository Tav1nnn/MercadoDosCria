/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.entities;

/**
 *
 * @author otavio
 */
public class CompraProduto {
    
    private int quantidade;
    private int idCompra;
    private int idProduto;

    public CompraProduto() {
    }

    public CompraProduto(int quantidade, int idCompra, int idProduto) {
        this.quantidade = quantidade;
        this.idCompra = idCompra;
        this.idProduto = idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    
    @Override
    public String toString(){
        return "Produto: " + this.idProduto + " Quantidade: " + this.quantidade;
    }
}
