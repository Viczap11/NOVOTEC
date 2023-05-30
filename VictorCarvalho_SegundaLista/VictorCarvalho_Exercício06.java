/*
Mostra o preço de acordo com o sabor do picolé e a quantidade
Autor:Victor Geovanne
30/05/2023 
 */

 //Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício06{
    public static void main (String [] args){
        
        //Declaração das variáveis
        Scanner leitor = new Scanner(System.in);
        double pk, pl, pr, res;

       //Instrução para o usuário e recepção das variáveis
       System.out.println("Digite a quantidade de picolés de kiwi");
       pk=leitor.nextDouble();
       System.out.println("Digite a quantidade de picolés de laranja");
       pl=leitor.nextDouble();
       System.out.println("Digite a quantidade de picolés de romã");
       pr=leitor.nextDouble();

       //Resultado das contas 
       res = ((pk * 3.20) + (pl * 2.39) + (pr * 7.99));
       
       //Saída
       System.out.println("O valor total é: " + res);
       
       //Encerramento da classe Scanner
        leitor.close();
    }
}