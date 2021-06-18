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
public class Eleitor extends Pessoa {
    private String cidade;
    private String nome_usuario;
    private String senha;
    public ArrayList ListaEleições; // adicionar eleições nesta lista
    
    public Eleitor(String cidade, String nome_usuario, String senha, String nome, String CPF, String idade) {
        super(nome, CPF, idade);
        this.cidade = cidade;
        this.nome_usuario = nome_usuario;
        this.senha = senha;
    }

    public String getCidade() {
        return cidade;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Eleitor{" + "cidade=" + cidade + ", nome_usuario=" + nome_usuario + ", senha=" + senha + '}';
    } 
    
    @Override
    public String toCsv(){
        
        return super.toString() + cidade + ";" +  nome_usuario + ";" +  senha;
    }
    
    
}
