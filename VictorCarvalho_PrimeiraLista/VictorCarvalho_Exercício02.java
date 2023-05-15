/*
/Recebe 4 números e soma a potenciação deles 
/Autor: Victor Geovanne 
/Data: 09/05/2023
*/
// Importa a Classe Scanner
import java.util.Scanner;
// Importa a classe principal 
public class VictorCarvalho_Exercício02 {

    public static void main( String [] args){
       //Classe scanner
       Scanner leitor = new Scanner(System.in);
        //Declaração de variáveis
        int n1, n2, n3, n4, res;
        //Inicialização de variáveis
        n1 = n2 = n3 = n4 = res = 0;
        //Explica o que o usuário deve fazer
        System.out.println("Insira 4 números: ");
        //Recebe as variáveis da pessoa
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();
        n4 = leitor.nextInt();
        //Valor do resultado
        res =((n1*n1 ) + (n2*n2) + (n3*n3) + (n4*n4));
        //Exibição do resultado
        System.out.println("O resultado é: " + res);
       // Encerramento do leitor(Scanner)
        leitor.close();
    }
}
