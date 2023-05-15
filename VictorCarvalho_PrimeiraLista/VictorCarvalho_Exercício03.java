/*
/Recebe um valor em R$ e transforma em U$
/Autor: Victor Geovanne 
/Data: 09/05/2023
 */
// Importa a Classe Scanner 
 import java.util.Scanner;
// Importa a classe principal
 public class VictorCarvalho_Exercício03 {
  
    public static void main(String [] args){
        // Classe Scanner
        Scanner leitor = new Scanner(System.in);
        // Declaração de Variáveis 
        double R,D;
        // Inicialização das Variáveis
        R = D = 0;
        // Instrução para o usuário 
        System.out.println("Digite o valor em R$:");
        // Recepção das Variáveis enviadas pelo usuário
        R = leitor.nextDouble();
        // Valor do resultado (saída)
        D = R/4.93;
        // Exibição do resultado
        System.out.println("O valor convertido em U$ é: " + D);
        // Encerramento do leitor(Scanner)
        leitor.close();
    }
}
