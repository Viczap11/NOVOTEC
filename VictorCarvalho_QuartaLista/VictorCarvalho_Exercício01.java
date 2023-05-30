
/*
Soma os números que o quadrado seja divisível por 4
Autor:Victor Geovanne
30/05/2023
*/
public class VictorCarvalho_Exercício01 {
   public static void main(String [] args ){
    
    //Declaração de variáveis
    int cont, nbase, potencia;

    //Inicialização das variáveis
    cont=potencia=nbase=0;

    //Estrutura de repetição para coleta dos valores
   while(cont < 1000){
        cont++;
        potencia=cont * cont;
            
                //Estrutura condicional para se for divisível por 4
                if(potencia % 4==0){
                    nbase=nbase + cont;  
                }
            } 
    //Saída        
    System.out.println("A soma dos números que o quadrado é divisível por 4 é: "+ nbase);
   } 
}
