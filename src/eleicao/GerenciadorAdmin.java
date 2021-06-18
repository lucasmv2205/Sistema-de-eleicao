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
public class GerenciadorAdmin {
    ArrayList <administrador> listaAdms = new ArrayList();
    
    public void cadastrarAdm(String username, String senha){
        administrador a;
        a = new administrador(username,senha);
        listaAdms.add(a);
    }
    
}
