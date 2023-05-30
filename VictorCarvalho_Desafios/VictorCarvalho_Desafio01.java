/*
Recebe números até  ser mencionado o número 0 e mostra qual o maior
Autor:Victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Desafio01 {
    public static void main(String [] args){

        //Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        int n,maior ;

        //Inicialização de variáveis
        n=maior=0;

        //Instrução pro usuário e recepção de variáveis
        System.out.println("Digite um número ");
        n=leitor.nextInt();

        //Estrutura condicional para se o número não for 0
        if(n!=0){
            
            //Estrutura de repetição enquanto o número não for 0
            while(n!=0){
                
                 //Instrução pro usuário e recepção de variáveis
                System.out.println("Digite um número ");
                n = leitor.nextInt();   
                    
                //Estrutura condicional se o número for maior que o maior número anterior 
                if(n>maior){
                            maior=n;
                        }
                    }
            }
       
            //Saída
            System.out.println(maior + " foi o maior número");
        
            //Encerramento do leitor
            leitor.close();
    }
    
}
