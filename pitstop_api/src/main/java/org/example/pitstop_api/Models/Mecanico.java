package org.example.pitstop_api.Models;

public class Mecanico {
    private String nome;
    private String telefone;

    public Mecanico(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public Mecanico() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
