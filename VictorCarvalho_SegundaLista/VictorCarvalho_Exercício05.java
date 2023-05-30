/*
Mostra o sucessor e o antecessor
Autor:Victor Geovanne
30/05/2023
*/




//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício05{
    public static void main (String [] args){
        //Decclaração das variáveis
        Scanner leitor = new Scanner(System.in);
        int n;

        //Inicialização das variáveis
        n = 0;

        //Instrução para o usuário e recepção das variáveis
        System.out.println("Digite um número");
        n = leitor.nextInt();

        //Saída
        System.out.println("O antecessor de "+ n + " é: " + (n-1) );
        System.out.println("O Sucessor de "+ n + " é: " + (n+1) );
       
        //Encerramento da classe Scanner
        leitor.close();
    }
}