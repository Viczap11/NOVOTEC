/*
Inverte os valores das variáveis
Autor:Victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;


public class VictorCarvalho_Exercício04{
    public static void main (String [] args){
        
        //Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        float a, b, c;

        //Inicialização das variáveis
        a = b = c = 0;

        //Instrução para o usuário e recepção das variáveis
        System.out.println("Digite o primeiro número");
        a=leitor.nextFloat();
        System.out.println("Digite o segundo número");
        b=leitor.nextFloat();
        
        //Inversão de valores
        c=a;
        a=b;
        b=c;

        //Saída
        System.out.println("Inverteremos os valores..");
        System.out.println("O 1º número é: "+a+" o 2ºnumero é: "+ b);
       
       //Encerramento da classe Scanner
        leitor.close();

    
    }
    
}