/*
Lê dois números e mostra os números entre eles
Autor: victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício02{
   
    public static void main (String [] args){
        
        //Declaração das variáveis
        Scanner leitor = new Scanner(System.in);
        int n1, n2, cont;

        //incialização das variáveis
        n1 = 0;
        n2 = 0;
        cont = 0;

        //Instrução para o usuário e recepção das variáveis
       System.out.println("Digite dois números: ");
       n1 =leitor.nextInt();
       n2 =leitor.nextInt();
       
       //Estrutura condicional
       if(n1<n2){
        cont = n1 + 1;
        
        //Estrutura de repetição e saída
        while(cont < n2 ){
            
                System.out.println(cont);
                cont++;
            }
            }else if(n2<n1){ 
                    cont = n2 + 1;
                    
                    //Estrutura de repetição e saída
                    while(cont < n1 ){
                        
                        System.out.println(cont);
                        cont++;
                            }

                        }else{

                        }
                
        //Encerramento da classe Scanner
    leitor.close();
    }
}