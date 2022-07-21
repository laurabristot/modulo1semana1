// Crie um programa em Java que pergunte ao usuário seu último sobrenome e em seguida exiba na tela o texto “Olá, X. Seu sobrenome contém y letras”, onde X é o sobrenome em letras maiúsculas, e y é a quantidade de letras desse sobrenome.

package modulo_1_semana_1;

import java.util.Scanner;

public class exercicio_4 {
  public static void main(String[] args){
    String surname;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite seu sobrenome");
    surname = leitor.nextLine();
    System.out.println("Olá, " + surname.toUpperCase() +". Seu sobrenome possui " + surname.replace(" ", "").length() + " letras.");
    leitor.close();
  }
}
