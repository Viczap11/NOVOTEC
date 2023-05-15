/*
/Recebe a idade da pessoa e classifica-a de acordo com a faixa etária
/Autor: Victor Geovanne 
/Data: 09/05/2023

*/
// Importa a Classe Scanner 
import java.util.Scanner;
// Importa a classe principal 
public class VictorCarvalho_Exercício05 {
    public static void main (String [] args){
        // Classe Scanner 
        Scanner leitor = new Scanner (System.in);
        // Declaração de variáveis
        int idd;
        // Inicialização das Variáveis
        idd = 0;
        //Explica o que o usuário deve fazer
        System.out.println("Digite sua idade: ");
         //Recebe as variáveis da pessoa
        idd = leitor.nextInt();
        // Decisão encadeada
        if (idd>=65) {
            System.out.println("Você é idoso.");
            
        }  else if(idd>= 19){
            System.out.println("Você é adulto.");
        
        }   else if(idd>=12){
            System.out.println("Você é adolescente.");

        }   else {
            System.out.println("Você é criança");
        }
       // Encerramento do leitor(Scanner)
        leitor.close();

        
            
    
    }
    
}
