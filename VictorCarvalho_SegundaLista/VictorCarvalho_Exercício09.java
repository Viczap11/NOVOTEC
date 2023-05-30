/*
Exibe a saída de acordo com a ordem numérica
Autor:Victor Geovanne
30/05/2023
 */

 //Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício09{
    public static void main (String [] args){
        
       //Declaração de variáveis
       Scanner leitor = new Scanner(System.in);
       double n1, n2;

       //Inicialização das variáveis
       n1 = n2 = 0;
       
       //Instrução para o usuário e recepção das variáveis
       System.out.println("Digite o 1ºnúmero");
        n1 =leitor.nextDouble();
       System.out.println("Digite o 2ºnúmero");
        n2 =leitor.nextDouble();

       //Estrutura de repetição e saída
       if(n1 == n2){
        System.out.println("Os números são iguais");
        }else if(n1>n2){
            System.out.println("O primeiro é maior");

            }else{
                System.out.println("O primeiro é menor");
            }

        //Encerramento da classe Scanner  
        leitor.close();
    }
}