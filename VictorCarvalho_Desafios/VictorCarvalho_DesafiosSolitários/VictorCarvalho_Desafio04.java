/*
Operações de um programa de controle
Autor: Victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Desafio04 {
  public static void main(String [] args){

    //Declarção das variáveis
    Scanner leitor = new Scanner(System.in);
    char opcao;int estoque;

    //Inicialização das  variáveis
    opcao=' ';estoque=0;

    //Instrução para o usuário e recepção da variável
    System.out.println("Digite X Para fechar o programa.");
    System.out.println("A Para adicionar uma unidade em estoque.");
    System.out.println("B Para Subtrair uma unidade em estoque.");
    System.out.println("C Para Mostrar o total em Estoque.");

    opcao=leitor.nextLine().charAt(0);


    //Estrutura condicional 
    if(opcao!='X'){
        

        //Estrutura repetitiva
        while(opcao!='X'){
            
            //Instrução para o usuário e recepção da variável
            System.out.println("Digite a próxima opção");
            opcao=leitor.nextLine().charAt(0);
           
           //Estrutura condicional 
            
           //Se Igual a 'A'
           if(opcao == 'A'){
                    estoque =estoque +1 ;
                    
                    //Se Igual a 'B'
                }else if(opcao == 'B'){
                        estoque=estoque-1;
                    
                        //Se Igual a 'C'
                        }else if(opcao == 'C'){
                                System.out.println("O total no estoque é: " + estoque);
                           
                                //Se Igual a 'X'
                            }else if(opcao == 'X'){
                                 //Saída final
                                 System.out.println("Fim do programa");
                           
                                //Se Igual a alguma letra não mencionada
                                }else if(opcao != 'A' || opcao!='B' || opcao != 'C' || opcao != 'X' ){
                                System.out.println("Erro!! Tente novamente");}
        }
    }

    
    //Encerramento da classe Scanner
    leitor.close();
    }
}