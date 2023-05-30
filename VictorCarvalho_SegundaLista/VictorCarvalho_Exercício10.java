/*
Mostra se o número é par ou ímpar
Autor:victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício10{
    public static void main (String [] args){
       
       //Declaração das variáveis
        Scanner leitor = new Scanner(System.in);
       int n;

       //Inicialização das variáveis
       n=0;

       //Instrução para o usuário e recepção das variáveis
       System.out.println("Digite um número");
       n=leitor.nextInt();
       
       //Estrutura condicional e saída
       if(n % 2 == 0){
            System.out.println("Seu número é par");
        }
        else{
            System.out.println("Seu número é impar");
        }
       
       //Encerramento das variáveis
        leitor.close();
    }
}