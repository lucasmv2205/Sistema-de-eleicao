/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicao;

/**
 *
 * @author Lucas Martins
 */
public abstract class Pessoa {
    private String nome;
    private String CPF;
    private String idade;

    public Pessoa(String nome, String CPF, String idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public String getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", CPF=" + CPF + ", idade=" + idade + '}';
    }
    
    public String toCsv(){
        
        return nome + ";" +  CPF + ";" +  idade + ";";
    }
    
    
    
}
