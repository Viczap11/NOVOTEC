/*
Soma números positvos, soma negativos e mostra qual a maior soma
Autor:Victor Geovanne
30/05/2023
*/

//Importa a classe Random
import java.util.Random;
public class VictorCarvalho_Exercício03 {
    public static void main(String[] args){
        
        //Declaração de variáveis
        Random aleat = new Random();
        int soma1;double soma2;

        //Inicialização das variáveis
        soma1 = 0;soma2 = 0.0;
        
        //Estrutura de repetição
        for(int vzs= 0 ; vzs <50;vzs++ ){
            soma1= soma1 + aleat.nextInt();
            
            soma2=soma2+aleat.nextDouble();
           
        }
    
        //Estrutura condicional + possível saída 
        if(soma1>soma2){
            System.out.println("A soma dos números inteiros é maior:" + soma1);
            System.out.println("soma dos reais: " + soma2);
        }else{
            System.out.println("A soma dos números reais é maior:" + soma2);
            System.out.println("Soma dos inteiros: "+ soma1);
        }
    }
}
