// Você pode utilizar o código do exercício anterior para este exercício. Crie um programa em Java que, utilizando a classe Scanner, pergunte ao usuário seu sobrenome, depois seu nome, e então escreva na tela o nome completo do usuário, seguido por suas iniciais. Por exemplo: “Olá Fulano Silva, suas iniciais são F.S.”.

package modulo_1_semana_1;

import java.util.Scanner;

public class exercicio_3 {
  public static void main(String[] args){
    String name;
    String surname;
    
    Scanner leitor = new Scanner(System.in);
    System.out.println("Qual o seu sobrenome?");
    surname = leitor.nextLine();
    
    System.out.println("Qual o seu nome?");
    name = leitor.nextLine();
  
    
    char firstLetterName = name.charAt(0);
    char firstLetterSurname = surname.charAt(0);
    
    
    System.out.println("Olá, " + name + " " + surname + ", suas iniciais são " + firstLetterName + "." + firstLetterSurname + ".");
    
    leitor.close();
  }
}
