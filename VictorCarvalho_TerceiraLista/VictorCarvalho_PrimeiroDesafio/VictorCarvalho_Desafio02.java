/*
Mostra a quantidade de números que representa
Autor:Victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Desafio02 {
    public static void main(String [] args){
        //Declaração das variáveis
        Scanner leitor = new Scanner(System.in);
        int cont,nmr;
        
        //inicialização das variáveis
        cont=nmr=0;

        //Instrução para o usuário e recepção das variáveis
        nmr=leitor.nextInt();

        //Estrutura de repetição e saída
        while(cont<nmr){
            System.out.println(nmr);
            cont++;
        }

        //Encerramento da classe Scanner
        leitor.close();

    }
}