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
public class Foto {

    public static byte[] getFoto() {
        return null;
    }

    public static byte[] getimagem() {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int id;
    public byte[] imagem;

    public Foto(int id, byte[] imagem) {
        this.id = id;
        this.imagem = imagem;
    }

    public Foto() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

}
