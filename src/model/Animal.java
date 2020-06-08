/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author S.I
 */
public class Animal {

    public Integer id;
    public String nome;
    public String apelido;
    public String raca;
    public String porte;
    public String cor;
    public String sexo;
    public String foto;
    public String pesquisa;
    public String data;
    public String observacao;
    public String tipo;

    public Animal(Integer id, String nome, String apelido, String raca, String porte, String cor, String sexo, String foto, String pesquisa, String data, String observacao, String tipo) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.raca = raca;
        this.porte = porte;
        this.cor = cor;
        this.sexo = sexo;
        this.foto = foto;
        this.pesquisa = pesquisa;
        this.data = data;
        this.observacao = observacao;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Animal() {

    }
}