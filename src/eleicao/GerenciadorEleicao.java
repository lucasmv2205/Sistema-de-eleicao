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
public class GerenciadorEleicao {
    public static GerenciadorCandidatos gCandidatos = new GerenciadorCandidatos();
    public static GerenciadorEleitor gEleitores = new GerenciadorEleitor();
    
    ArrayList <Eleicao> listaEleicoes = new ArrayList();
    
    public void cadastrarEleicao(String nome, String data, String descricao){
        Eleicao a;
        a = new Eleicao(nome,data,descricao);
        listaEleicoes.add(a);
    }
    
    public void cadastrarEleitoresEleicao(String nomeEleicao, Eleitor eleitor){ // rever esta função
        for(Eleicao p: listaEleicoes){
            if(p.getNome().equals(nomeEleicao)){
                p.ListaEleitores.add(eleitor);
            }
        }
    }
    
    public void AdicionarCandidatosEleicao(String nomeEleicao, Candidato candidato){
        for(Eleicao p: listaEleicoes){
            if(p.getNome().equals(nomeEleicao)){
                p.ListaCandidatos.add(candidato);
            }
        }
    }
    
    public void VotarCandidato(String chapa){
        for(Candidato p: gCandidatos.listaCandidatos){
            if(p.getNumero_id().equals(chapa)){
                p.Votar();
            }
        }
    }
    
    
}
