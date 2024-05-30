package org.example.model;

import org.example.pattern.TipoPagamento;

public class Cliente {

    private String nome;
    private String cpf;
    private String email;
    private String cep;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, String cpf, String email, String cep, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cep = cep;
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


}
