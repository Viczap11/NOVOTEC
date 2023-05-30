/*
Conta até 200 e mostra os múltiplos de dez
Autor:Victor Geovanne
30/05/2023
*/
public class VictorCarvalho_Desafio01 {
    public static void main(String [] args){
    
    //Declaração das variáveis
    int cont1, cont2;

    //Inicialização das variáveis
     cont1 = cont2 = 0 ;

     //Estrutura de repetição
     while(cont1<200){
        //Saídas 
        System.out.println(cont1);
        cont1++;
        cont2++;
        //Estrutura condicional para cada múltiplo de 10
        if( cont2 == 10 ){
            System.out.println("O número " + cont1 + " é múltiplo de 10");
            cont2 = 0;
        }

    }
     }   
    }    

