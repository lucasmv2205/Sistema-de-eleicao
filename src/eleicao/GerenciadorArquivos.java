/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleicao;

import static eleicao.TelaCadastroEleição.gEleicoes;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas Martins
 */
public class GerenciadorArquivos {
    public static GerenciadorAdmin gAdmin = new GerenciadorAdmin();
    public static GerenciadorCandidatos gCand = new GerenciadorCandidatos();
    public static GerenciadorEleicao gEleicao = new GerenciadorEleicao();
    
    public static void importarcsvAdms(String NomeArq) throws FileNotFoundException{
        
        Scanner entrada = new Scanner(new File(NomeArq));
        
        while(entrada.hasNext()){
        
            try{
                   String linha = entrada.nextLine();
                   String info[] = linha.split(";");
                   gAdmin.cadastrarAdm(info[0], info[1]);
                   //gAdmin.listaAdms.add(new administrador(info[0], info[1]));
            }

            catch(NoSuchElementException e){
                System.err.println("Arquivo com formato incorreto");
                entrada.close();
                System.exit(1);
            }
        }
    }
    
    public void importarcsvCandidatos(String NomeArq) throws FileNotFoundException{
        
        Scanner entrada = new Scanner(new File(NomeArq));
            while(entrada.hasNext()){
        
            try{
                   String linha = entrada.nextLine();
                   String info[] = linha.split(";");
                   gCand.cadastrarCandidato(info[0], info[1], info[2], info[3], info[4]);
            }

            catch(NoSuchElementException e){
                System.err.println("Arquivo com formato incorreto");
                entrada.close();
                System.exit(1);
            }
        }
    }
    
    public void importarEleicoesCSV(String NomeArq) throws FileNotFoundException{
        
        Scanner entrada = new Scanner(new File(NomeArq));
            while(entrada.hasNext()){
        
            try{
                   String linha = entrada.nextLine();
                   String info[] = linha.split(";");
                   gEleicoes.cadastrarEleicao(info[0], info[1], info[2]);
            }

            catch(NoSuchElementException e){
                System.err.println("Arquivo com formato incorreto");
                entrada.close();
                System.exit(1);
            }
        }
    }
        
    
    public void exportarEleicoesCSV(String nomeArq) throws IOException {
        try {
            File arquivo = new File(nomeArq);
            arquivo.createNewFile();
            //Escrever no arquivo
            FileWriter filewriter = new FileWriter(arquivo, false);
            PrintWriter writer = new PrintWriter(filewriter);
            for(int i=0; i< gEleicao.listaEleicoes.size(); i++){
                writer.println(gEleicao.listaEleicoes.get(i).toCsv());
            }
            writer.flush();
            writer.close();
            System.out.println("Passou!!!");
        } catch (IOException ex) {
            System.out.printf("\n%s Excecao: %s\n", ex);
        }
        }
        
        
}
