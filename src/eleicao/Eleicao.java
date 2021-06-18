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
public class Eleicao {
    private String nome;
    private String data;
    private String descricao;
    public ArrayList ListaEleitores; // cadastrar eleitores neste eleição
    public ArrayList ListaCandidatos; // cadastrar candidatos nesta eleição

    public Eleicao(String nome, String data, String descricao) {
        this.nome = nome;
        this.data = data;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Eleicao{" + "nome=" + nome + ", data=" + data + ", descricao=" + descricao + '}';
    }
    
    public String toCsv(){
        
        return nome + ";" +  data + ";" +  descricao;
    }
    
    
}
