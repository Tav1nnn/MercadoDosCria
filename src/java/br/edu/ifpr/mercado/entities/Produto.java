/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.entities;

/**
 *
 * @author otavio
 */
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private int quantidade;
    private int preco;
    private String fornecedor;
    private byte[] imagem;
    private String imagemtipo;

    public Produto() {
    }

    public Produto(int id, String nome, String descricao, int quantidade, int preco, String fornecedor, byte[] imagem, String imagemtipo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.fornecedor = fornecedor;
        this.imagem = imagem;
        this.imagemtipo = imagemtipo;
    }

    public Produto(String nome, String descricao, int quantidade, int preco, String fornecedor, byte[] imagem, String imagemtipo) {
        this.nome = nome;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        this.fornecedor = fornecedor;
        this.imagem = imagem;
        this.imagemtipo = imagemtipo;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getImagemtipo() {
        return imagemtipo;
    }

    public void setImagemtipo(String imagemtipo) {
        this.imagemtipo = imagemtipo;
    }
    
    
}
