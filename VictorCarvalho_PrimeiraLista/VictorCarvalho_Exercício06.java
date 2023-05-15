/*
/Calcula o perímetro de uma circunferência
/Autor: Victor Geovanne 
/Data: 09/05/2023
*/
// Importa a Classe Scanner 
import java.util.Scanner;
// Importa a classe principal 
public class VictorCarvalho_Exercício01 {
    public static void main (String [] args){
        // Classe Scanner 
        Scanner leitor = new Scanner(System.in);
          // Declaração de variáveis
        double rai, per;
          // Inicialização das Variáveis
        rai = per=0;
        //Explica o que o usuário deve fazer
        System.out.println("Digite o valor do raio ");
        //Recebe as variáveis da pessoa
        rai = leitor.nextDouble();
        // Valor do resultado (saída)
        per = (2 * 3.14 * rai);
        // Exibição do resultado
        System.out.println("Seu perímetro é: " + per );
        // Encerramento do leitor(Scanner)
        leitor.close();

    }
    
}
