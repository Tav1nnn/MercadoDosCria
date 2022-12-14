/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.entities;

/**
 *
 * @author otavio
 */
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String senha;
    private Boolean adm;

    public Usuario() {
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    

    public Usuario(String nome, String email, String senha, Boolean adm) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.adm = adm;
    }

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(int id, String nome, String email, String senha, Boolean adm) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.adm = adm;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAdm() {
        return adm;
    }

    public void setAdm(Boolean adm) {
        this.adm = adm;
    }
    
    
}
