/*
Recebe notas, calcula media e exibe quantos aprovaram e reprovaram
Autor: victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Desafio02 {
    public static void main(String [] args){

        //Declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, media; int cont, aprovado, reprovado; 
        
        //Inicialização das variáveis
        nota1 = nota2 = media  = 0.0; cont = aprovado = reprovado = 0;

        //Estrutura de repetição 
        while(cont<10){     //10 pode ser trocado por qualquer outro número
            
            //Instrução para o usuário e recepção de variáveis 
            System.out.println("Digite as duas notas");
            nota1 = leitor.nextDouble();
            nota2 = leitor.nextDouble();

            //Cálculo das médias
            media = (nota1 + nota2) /2;
            
            //Estrutura condicional para aprovar ou reprovar
            if(media<5){
                reprovado++;
            }else{
                aprovado++;
            }

            //Contar mais uma vez
            cont++;

        }
        //Saída
        System.out.println("No total são " + aprovado + " aprovados e " + reprovado + "reprovados");


        //Encerramento da classe Scanner
        leitor.close();

    }
}
