// Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário seu sobrenome, depois seu nome, e então escreva na tela, em uma única “string”, o nome completo do usuário. Informe também ao usuário quantas letras tem no nome dele. Por exemplo: “Olá Fulano Silva, seu nome possui 11 letras.”.

package modulo_1_semana_1;

import java.util.Scanner;

public class exercicio_2 {
  public static void main(String[] args){
    String name;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite seu nome completo");
    name = leitor.nextLine();
    System.out.println("Olá, " + name +", seu nome possui " + name.replace(" ", "").length() + " letras.");
    leitor.close();
  }
}
