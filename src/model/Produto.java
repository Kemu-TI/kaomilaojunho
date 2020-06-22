/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author S.I
 */
public class Produto {

    public Integer codigo;
    public String categoria;
    public String nome;
    public String descricao;
    public String data;
    public String validade;
    public String fabricante;
    public String cnpj;
    public Integer estoque;
    public Integer vlr_fornecedor;
    public Integer vlr_venda;
    public Integer mat_usuario;
    
   

      public Produto() {
     
    }

    public Produto(Integer codigo, String categoria, String nome, String descricao, String data, String validade, String fabricante, String cnpj, Integer estoque, Integer vlr_fornecedor, Integer vlr_venda, Integer mat_usuario) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.validade = validade;
        this.fabricante = fabricante;
        this.cnpj = cnpj;
        this.estoque = estoque;
        this.vlr_fornecedor = vlr_fornecedor;
        this.vlr_venda = vlr_venda;
        this.mat_usuario = mat_usuario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    public Integer getVlr_fornecedor() {
        return vlr_fornecedor;
    }

    public void setVlr_fornecedor(Integer vlr_fornecedor) {
        this.vlr_fornecedor = vlr_fornecedor;
    }

    public Integer getVlr_venda() {
        return vlr_venda;
    }

    public void setVlr_venda(Integer vlr_venda) {
        this.vlr_venda = vlr_venda;
    }

    public Integer getMat_usuario() {
        return mat_usuario;
    }

    public void setMat_usuario(Integer mat_usuario) {
        this.mat_usuario = mat_usuario;
    }
 }
