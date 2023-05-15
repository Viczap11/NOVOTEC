/*
/Recebe 4 números e soma eles 
/Autor: Victor Geovanne 
/Data: 09/05/2023
*/
// Importa a Classe Scanner 
import java.util.Scanner;
// Importa a classe principal
public class VictorCarvalho_Exercício01 {
 
    public static void main(String [] args){
        // Classe Scanner
        Scanner leitor = new Scanner(System.in);
        // Declaração de variáveis
        int  n1, n2, n3, n4, res;
        // Inicialização de variáveis
        n1 = n2 = n3 = n4 = res = 0;    
        // Instrução para o usuário
        System.out.println("Digite 4 números");
        // Recebe as variáveis do usuário
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();
        n4 = leitor.nextInt();
        // Resultado 
        res= n1 + n2 + n3 + n4;
        // Exibe o resultado 
        System.out.println("Seus números são: " + n1 +" " +  n2 + " " +  n3 + " " + n4 +"" + " A soma deles é: " + res);
        // Encerramento do leitor(Scanner)
        leitor.close();
    }
}
