// Crie um programa em Java que pergunte ao usuário: nome, idade e se gosta de praticar algum esporte. Crie 3 variáveis para guardar as respostas do usuário: uma deve receber um valor textual (string), outra deve receber um valor numérico (int), e outra um valor de verdadeiro ou falso (boolean). Faça com que esses 3 valores sejam exibidos de volta para o usuário.

package modulo_1_semana_1;

import java.util.Scanner;

public class exercicio_5 {
  public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Qual seu nome?");
    String name = leitor.nextLine();
    
    System.out.println("Quantos anos você tem?");
    int age = leitor.nextInt();

    System.out.println("Você gosta de esportes? (true/false)");
    boolean likeSports = leitor.nextBoolean();
     if (likeSports == true) {
      System.out.println("Olá, " + name + ". Você tem " + age + " anos, e gosta de esportes.");
     }
     else {
      System.out.println("Olá, " + name + "você tem " + age + " anos, e não gosta de esportes.");
     }

    leitor.close();
  }
}
