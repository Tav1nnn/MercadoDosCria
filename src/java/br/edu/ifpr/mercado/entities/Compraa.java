/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.entities;

/**
 *
 * @author otavio
 */
public class Compraa {
    private int id;
    private String endereco;
    private int idUsuario;

    public Compraa() {
    }

    public Compraa(String endereco, int idUsuario) {
        this.endereco = endereco;
        this.idUsuario = idUsuario;
    }
    
    

    public Compraa(int id, String endereco, int idUsuario) {
        this.id = id;
        this.endereco = endereco;
        this.idUsuario = idUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    
}
