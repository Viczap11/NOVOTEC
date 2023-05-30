/*
 Calcula a área de um triângulo
 Autor: Victor Geovanne 
 30/05/2023
 */




//Importa a classe Scanner
 import java.util.Scanner;
public class VictorCarvalho_Exercício03{
    public static void main (String [] args){
        //Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        double base, altura,res;

        //Inicialização das variáveis
        base = altura = res = 0;

        //Instrução e recepção das variáveis
        System.out.println("Digite a base");
        base = leitor.nextDouble();
        System.out.println("Digite a altura");
        altura = leitor.nextDouble();
        
        //Resultado 
        res = (altura*base)/2;

        //Saída
        System.out.println("A área do triângulo é: "+ res + "m²");
        
        //Encerramento da classe Scanner
        leitor.close();

    }
}