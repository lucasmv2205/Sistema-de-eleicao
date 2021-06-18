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
public class Sistema {
    private String desenvolvedores;
    private String dataCriacao;
    private String versao;

    public Sistema(String desenvolvedores, String dataCriacao, String versao) {
        this.desenvolvedores = desenvolvedores;
        this.dataCriacao = dataCriacao;
        this.versao = versao;
    }

    public String getDesenvolvedores() {
        return desenvolvedores;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public String getVersão() {
        return versao;
    }

    public void setDesenvolvedores(String desenvolvedores) {
        this.desenvolvedores = desenvolvedores;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setVersão(String versao) {
        this.versao = versao;
    }

    @Override
    public String toString() {
        return "Sistema{" + "desenvolvedores=" + desenvolvedores + ", dataCriacao=" + dataCriacao + ", versao=" + versao + '}';
    }
    
    
    
    
}
