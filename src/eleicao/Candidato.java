/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicao;

import java.util.ArrayList;

/**
 *
 * @author Lucas Martins
 */
public class Candidato extends Pessoa {
    private String numero_id;
    private String descricao;
    private int voto;
    public ArrayList ListaEleições; // adicionar eleições nessa lista

    public Candidato(String numero_id, String descricao, String nome, String CPF, String idade) {
        super(nome, CPF, idade);
        this.numero_id = numero_id;
        this.descricao = descricao;
        this.voto = 0;
    }

    public String getNumero_id() {
        return numero_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getVoto() {
        return voto;
    }

    public void setNumero_id(String numero_id) {
        this.numero_id = numero_id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    @Override
    public String toString() {
        return "Candidato{" + "numero_id=" + numero_id + ", descricao=" + descricao + ", voto=" + voto + '}';
    }
    
    public void Votar() {
        this.voto = voto + 1;
    }
    
    @Override
    public String toCsv(){
        
        return super.toString() + numero_id + ";" +  descricao + ";" +  voto;
    }
    
    
}
