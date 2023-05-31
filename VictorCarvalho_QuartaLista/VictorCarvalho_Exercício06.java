/*
Soma dois 10 valores e mostra a raiz quadrada
Autor:Victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício06 {
    public static void main(String [] args){
        
        //Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        int valor,inser;

        //Inicialização de variáveis
        valor=inser=0;
        
       //Estrutura de repetição
        for(int vzs = 0; vzs <3; vzs++){
            
            //Instrução pro usuário e recepção das variáveis
            System.out.println("Digite um valor ");
            inser= leitor.nextInt();

            //Estrutura condicional 
            if(inser>=0){
                
                valor=valor+inser;
            }else{
    
            }
        }
        
        //Saída
        System.out.println("A soma é: " + valor + " o quadrado é: " + valor * valor);
        
        //Encerramento da classe Scanner
        leitor.close();
    }
    
}
