/* Autor: Victor Hugo Campos Santana
 * Fatec Zona Leste
 * Exercicio feito para aula de Estrutura de dados Lecionado por Leandro Colevati
 * 
 * Lista 3 Exercicio 5
 * Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um
 *  número inteiro, converta para binário. Entrada limitada a 2000
 */

package view;
import controller.ClassFibonacci;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		//Lê a posição requerida da fibonacci e limita entrada a 20
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite  a posição de fibonacci que quiser contato que"
				+ " seja menor que 20 e maior que 0: ");
		int pos_fib = Integer.parseInt(scanner.nextLine());
		
		while ((pos_fib < 0) || (pos_fib>20)) {
			System.out.println("A posição deve estar entre 1 e 20 tente novamente: ");
			pos_fib = Integer.parseInt(scanner.nextLine());
		}
		
		scanner.close();
		
		//Chama classe feita para achar o numero da sequencia de fibonacci
		ClassFibonacci acha_n = new ClassFibonacci();
		int fib_n = acha_n.EncontraPosicao(pos_fib);
		
		//Saída pedida
		System.out.println("A posição "+ pos_fib +" da sequencia de fibonacci é "+fib_n);
		
	}
}
