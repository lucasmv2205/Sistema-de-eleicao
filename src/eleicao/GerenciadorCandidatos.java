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
public class GerenciadorCandidatos {
    ArrayList <Candidato> listaCandidatos = new ArrayList();
    
    public void cadastrarCandidato(String numero_id, String descricao, String nome, String CPF, String idade){
        Candidato a;
        a = new Candidato(numero_id,descricao,nome,CPF,idade);
        listaCandidatos.add(a);
    }
    
    public Candidato consultarCandidatoPorCPF(String CPF){
        for(Candidato p: listaCandidatos){
            if(p.getCPF() == CPF){
                return p;
            }
        }
        return null;
    }
    
    
    
    
}
