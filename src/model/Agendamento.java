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
public class Agendamento {
    
    public Integer n_servico;
    public Integer id_animal;
    public String tipo;
    public String cpf;
    public String tiposervico;
    public String data;
    public String hora;

    public Agendamento () {

}

    public Agendamento(Integer n_servico, Integer id_animal, String tipo, String cpf, String tiposervico, String data, String hora) {
        this.n_servico = n_servico;
        this.id_animal = id_animal;
        this.tipo = tipo;
        this.cpf = cpf;
        this.tiposervico = tiposervico;
        this.data = data;
        this.hora = hora;
    }

    public Integer getN_servico() {
        return n_servico;
    }

    public void setN_servico(Integer n_servico) {
        this.n_servico = n_servico;
    }

    public Integer getId_animal() {
        return id_animal;
    }

    public void setId_animal(Integer id_animal) {
        this.id_animal = id_animal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTiposervico() {
        return tiposervico;
    }

    public void setTiposervico(String tiposervico) {
        this.tiposervico = tiposervico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
}