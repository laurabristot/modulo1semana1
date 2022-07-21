// Crie um programa em Java que faça 2 perguntas ao usuário: primeiro, pergunte o ano de nascimento. Depois, pergunte o ano atual. Em seguida, exiba na tela o texto “Sua idade é x ou y”, onde x é a idade do usuário caso ele já tenha feito aniversário neste ano, e y é a idade caso ele ainda não tenha aniversariado no ano corrente.

package modulo_1_semana_1;

import java.util.Scanner;

public class exercicio_6 {
  public static void main(String[] args){
  Scanner leitor = new Scanner(System.in);
  
  System.out.println("Qual ano você nasceu?");
  int anoNascimento = leitor.nextInt();

  System.out.println("Qual ano atual?");
  int anoAtual = leitor.nextInt();

  int idade = anoAtual - anoNascimento;
  int idade2 = anoAtual - anoNascimento - 1;

    System.out.println("Se você já fez aniversário, você tem " + idade + " anos. Se você ainda não fez, tem " + idade2 + " anos.");

  leitor.close();
}}
