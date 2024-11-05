package com.efigenio.models;

public class Aluno {
    private String nome;
    private String nascimento;
    private String cpf;
    private String email;
    private Notas notas;

    public Aluno(String nome, String nascimento, String cpf, String email) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

}