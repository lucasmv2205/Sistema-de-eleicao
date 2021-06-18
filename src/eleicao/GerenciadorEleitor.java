/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicao;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas Martins
 */
public class GerenciadorEleitor {
    public static GerenciadorEleitor gEleitores = new GerenciadorEleitor();
    public static GerenciadorEleicao gEleicoes = new GerenciadorEleicao();
    
    ArrayList <Eleitor> listaEleitores = new ArrayList();
    
    public void cadastrarEleitor(String cidade, String nome_usuario, String senha, String nome, String CPF, String idade){
        Eleitor a;
        a = new Eleitor(cidade,nome_usuario,senha,nome,CPF,idade);
        listaEleitores.add(a);
    }
    
    public Eleitor consultarEleitorPorCPF(String CPF){
        for(Eleitor p: listaEleitores){
            if(p.getCPF() == CPF){
                return p;
            }
        }
        return null;
    }
    
    public void adicionarEleitorNaEleicao(Eleicao eleicao, String CPFeleitor){ // rever esta função
        for(Eleicao p: gEleicoes.listaEleicoes){
            if(p.getNome().equals(eleicao.getNome())){
                Eleitor a;
                a = consultarEleitorPorCPF(CPFeleitor);
                a.ListaEleições.add(p);
            }
        }
    }
    
    public ArrayList consultarEleicaoDoEleitor(String CPF){
        Eleitor a = consultarEleitorPorCPF(CPF);
        return a.ListaEleições;
    }

}
