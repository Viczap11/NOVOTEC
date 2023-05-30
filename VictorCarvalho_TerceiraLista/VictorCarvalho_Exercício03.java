/*
Calcula a média de 500 números
Autor:Victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício03{
    public static void main (String [] args){
        
        //Declaração de variáveis 
        Scanner leitor = new Scanner(System.in);
        int contador;
        double somador, media;
        
        //Inicialização de variáveis
        contador = 0;
        somador = media = 0;

        //Estrutura de repetição
        while(contador < 10){

            //Instrução para o usuário e recepção de variáveis
            System.out.println("Digite um número: ");
            somador += leitor.nextDouble();
            contador++;
        }

        //Valor de recepção da média
        media = somador / contador;

        //Saída
        System.out.println("Sua média é: " + media);
        
        //Encerramento da classe Scanner
        leitor.close();
    }
}