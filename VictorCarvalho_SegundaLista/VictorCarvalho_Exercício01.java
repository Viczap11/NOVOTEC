/*
Recebe um valor e desconta 15%
Autor:Victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício01{
    public static void main (String [] args){
        //Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        double n1, res;

        //Inicialização das variáveis
        n1 = res = 0;

        //Instrução  para o usuário
        System.out.println("Digite o valor que deseja aplicar o desconto");
       
       //Recebe a variável
        n1= leitor.nextDouble();

        //Resultado
        res= n1 - n1*0.15;
        
        //Saída
        System.out.println("O valor com desconto é " + res);
        leitor.close();

    }
}
