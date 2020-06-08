/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import javafx.scene.chart.PieChart;
import javax.xml.crypto.Data;

/**
 *
 * @author Kemu27
 */
public class Cliente {
  
    
    public Integer id_animal;
    public String nome;
    public String cpf;
    public String rg;
    public String data;
    public String sexo;
    public String logradouro;
    public String complemento;
    public Integer numero;
    public String cidade;
    public String estado;
    public String cep;
    public String contato;
    public String email;
    public String cartao;
    public String bandeira;
    public Integer n_cartao;
    public String validade;


    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Cliente(String validade) {
        this.validade = validade;
    }

    public Cliente() {
   
    }

    public Integer getId_animal() {
        return id_animal;
    }

    public void setId_animal(Integer id_animal) {
        this.id_animal = id_animal;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public Integer getN_cartao() {
        return n_cartao;
    }

    public void setN_cartao(Integer n_cartao) {
        this.n_cartao = n_cartao;
    }

    public Cliente(Integer id_animal, String nome, String cpf, String rg, String data, String sexo, String logradouro, String complemento, Integer numero, String cidade, String estado, String cep, String contato, String email, String cartao, String bandeira, Integer n_cartao) {
        this.id_animal = id_animal;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.data = data;
        this.sexo = sexo;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.contato = contato;
        this.email = email;
        this.cartao = cartao;
        this.bandeira = bandeira;
        this.n_cartao = n_cartao;
    }
}
