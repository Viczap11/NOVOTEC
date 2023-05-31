/*
Confere se a senha está correta ou não
Autor: Victor Geovanne
30/05/2023
*/

//Importa a classe Scanner
import java.util.Scanner;
public class VictorCarvalho_Desafio03 {
  public static void main(String [] args){

    //Declarção das variáveis
    Scanner leitor = new Scanner(System.in);
    String senha;

    //Inicialização das variáveis
    senha = "";

    //Instrução para o usuário
    System.out.println("Digite a senha correta");
    senha=leitor.nextLine();


    //Estrutura condicional
    if(senha!="jumiraldsmeuxuxu"){
        
        //Estrutura repetitiva
        while(senha!="jumiraldsmeuxuxu"){
        System.out.println("Tente novamente");
        
    }
}
    //Saída
    else{
       System.out.println("Senha correta");;
    
}
    //Encerramento classe Scanner
    leitor.close();
  }  
}
