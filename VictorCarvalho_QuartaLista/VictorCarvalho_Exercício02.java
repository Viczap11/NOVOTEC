/*
Recebe três números infinitamente até a soma deles ser 48 ou 71
Autor:Victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Exercício02 {
    public static void main(String [] args){

        //Declaração das variáveis 
        Scanner leitor = new Scanner(System.in);
        int n1, n2, n3, soma;

        //Inicialização das variáveis
        n1=n2=n3=0;

        //Estrutura de repetição
        do{
            //Instrução para o usuário
            System.out.println("Digite 3 números");

            //Recepção das variáveis 
            n1=leitor.nextInt();
            n2=leitor.nextInt();
            n3=leitor.nextInt();
            
            //Soma para conferência dos números
            soma=n1+n2+n3;

        }while (soma != 48 && soma !=71);
        
        //Encerramento da classe Scanner
        leitor.close();

    }
}
