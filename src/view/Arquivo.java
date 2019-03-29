
package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Arquivo {
    public static String[] lerArquivo(String filePath){    
        /*int numerodeLinhas = 0;
        int i = 0;
        try { 
            FileReader arq = new FileReader(filePath); 
            BufferedReader br = new BufferedReader(arq);                        
            String linha = br.readLine();                                    
            while(linha != null){                                               
                numerodeLinhas++;
                System.out.println(linha);
                linha = br.readLine();
            }
            arq.close();
        } catch (IOException e) { 
            System.err.printf("Erro na abertura do arquivo: %s.\n", 
            e.getMessage()); 
        }
        try {
            String[] vetor = new String[numerodeLinhas];                        
            FileReader arq1 = new FileReader(filePath); 
            BufferedReader br1 = new BufferedReader(arq1);
            String linha = "";
                        
            while(linha != null){
                if(i < vetor.length){
                    vetor[i] = br1.readLine();
                }
                linha = vetor[i];
                i++;
            }
            arq1.close();
            return vetor;            
        } catch (Exception e) {
        }
        return null;*/
        int numerosdeLinhas = 0; 
        String arquivo = filePath; 
        System.out.println(arquivo); 
        String linha = "1"; 
        int i = 0;       
        
        try { 
            FileReader arq = new FileReader(arquivo); 
            BufferedReader br = new BufferedReader(arq);            
            while(linha != null){                                               
                numerosdeLinhas = numerosdeLinhas + 1;                
                //System.out.println(br.readLine());
                linha = br.readLine();                
            }
            numerosdeLinhas = (numerosdeLinhas/2)-1;           
            arq.close();                 
        } catch (IOException e) { 
            System.err.printf("Erro na abertura do arquivo: %s.\n", 
            e.getMessage()); 
        }         
        String vetor[] = new String[numerosdeLinhas]; 
        linha = ""; 
        numerosdeLinhas = vetor.length - 1;         
        try { 
           FileReader arq1 = new FileReader(arquivo); 
           BufferedReader br1 = new BufferedReader(arq1);
           linha = br1.readLine();
           linha = br1.readLine(); 
           while(linha != null){ 
                vetor[i] = br1.readLine();
                if(i < numerosdeLinhas){ 
                    i++; 
                }
                linha = br1.readLine(); 
            } 
            arq1.close(); 
        } catch (IOException e) { 
            System.err.printf(e.getMessage()); 
        } 
        return vetor;
    }
    
    public static String geraArquivo(String[] vetor){
        try {
            // Cria arquivo
            File file = new File("Ordenados.txt");

            // Se o arquivo nao existir, ele gera
            if (!file.exists()) {
                file.createNewFile();
            }

            // Prepara para escrever no arquivo
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            // Escreve e fecha arquivo
            for (int t = 0; t < vetor.length; t++) {
                bw.write(vetor[t] + "Tamanho" + vetor[t].length());
                bw.newLine();
            }
            System.out.println(file.getAbsoluteFile());
            bw.close();
            return file.getAbsoluteFile().toString();
        } catch (Exception e) {

        }
        return null;
    }
    
}
