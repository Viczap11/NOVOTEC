/*
Exibe alguma informação de acordo com o tamanho da palavra inserida
Autor:Victor Geovanne
30/05/2023
*/

//Importação da classe Scanner
import java.util.Scanner;

public class VictorCarvalho_Exercício04 {
    public static void main(String [] args){
        
        //Declaração de variáveis
        Scanner leitor= new Scanner(System.in);
        String palavra;int caracteres;
        
        //Inicialização das variáveis
        palavra="";caracteres=0;

        //Instrução para o usuário e recepção de variáveis
        System.out.println("digite uma palavra");
        palavra=leitor.nextLine();

        //Transformação de String para Int
        caracteres=palavra.length();


        //Estrutura condicional e variações de saída
        if(caracteres>10){
            System.out.println("Você digitou um palavrão");
        }
        else{
            System.out.println("Você digitou uma palavrinha");
        }
        
        //Saída final
        System.out.println(palavra);
       
       //Encerramento da classe Scanner
        leitor.close();

    }
}
