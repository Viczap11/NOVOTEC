/* 
Exibe dados de uma pessoa
Autor:Victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício08{
    public static void main (String [] args){
        
        //Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
       int idd;double alt;String nome;char genero;
       
       //Inicialização de variáveis
       idd=0; alt=0.0; nome = ""; genero = ' ';

       //Intruções para o usuário e recepção de variáveis
       System.out.println("Digite sua idade");
       idd = leitor.nextInt();
       System.out.println("Digite sua altura (em metros)"); 
       alt = leitor.nextDouble();
       leitor.nextLine(); 
       System.out.println("Digite seu nome:");
       nome = leitor.nextLine(); 
       System.out.println("Digite M para masculino e F para feminino");
       genero = leitor.next().charAt(0);


       //Estrutura condicional 
       if(genero == 'm'  ){
        System.out.println("Seu gênero é masculino");

       }else if(genero == 'f'){
        System.out.println("Seu gênero é feminino");
       }

       //Saída
       System.out.println(nome + " sua idade é: " +idd + ",sua altura é: "+ alt + "m");
       
       //Encerramento da classe Scanner 
        leitor.close();
    }
}