package com.pierre.apitarefas.domain;
import java.time.LocalDate;
public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private LocalDate dataPub;
    private int id;

    public Livro(String nome, String autor, String editora, LocalDate dataPub, int id){
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.dataPub = dataPub;
        this.id = id;

    }
    public String getNome(){
        return nome;
    }
    public void  setNome(String nome){
        this.nome=nome;
    }
    public LocalDate getDataPub(){
        return dataPub;
    }
    public void setDataPub(LocalDate dataPub){
        this.dataPub = dataPub;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getEditora(){
        return editora;
    }
    public void setEditora(String editora){
        this.editora = editora;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
} 