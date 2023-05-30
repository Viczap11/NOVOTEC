/*
 Mostra qual número é maior
 Autor: Victor Geovanne 
 30/05/2023
 */


//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício02{
    public static void main (String [] args){
        //Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        int n1,n2,n3;
        
        //Inicialização das variáveis
        n1=n2=n3=0;
        
        //Instrução para o usuário
        System.out.println("Digite 3 números ");
       
       //Recebe as variáveis
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();
        
        //Estrutura condicional e saída
        if(n1>n2 & n1>n3){
                System.out.println(n1 + " é o maior");
            }else if(n2>n1 & n2>n3){
                    System.out.println(n2 + " é o maior");
                }else{
                    System.out.println(n3 + " é o maior");
            }
        
        //Encerramento da classe Scanner
        leitor.close();



    }
}