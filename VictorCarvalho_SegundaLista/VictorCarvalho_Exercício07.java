/*
Exibe uma mensagem de acordo com o informado
Autor:Victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício07{
    public static void main (String [] args){
        
        //Declaração das variáveis
        Scanner leitor = new Scanner(System.in);
       int n1;

       //Inicialização das variáveis
       n1=0;

       //Instrução para o usuário e recepção das variáveis
       System.out.println("Digite um número maior que 94 e menor que 456");
       n1 = leitor.nextInt();

       //Estrutura condicional e saída
       if(n1>94 & n1<456){
        System.out.println("Acertou!");
       }else{
        System.out.println("Tente de novo!");
       }

       
       
       
       
       
       
        leitor.close();
    }
}