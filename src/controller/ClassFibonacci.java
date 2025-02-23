package controller;

public class ClassFibonacci {
	public ClassFibonacci() {
		super();
	}
	
	public int EncontraPosicao(int n) {
		//se fibonacci que for chamada é = 1 ou 2, retorna seu valor que é 1
		if ((n == 1) || (n == 2)) {
			return 1;
		}
		/*se posicao requerida é maior que 2 então chama o calculo da fibonacci
		 *  chamando a recursao duas vezes
		 */
		else {
			return EncontraPosicao(n-1) + EncontraPosicao(n-2);
		}
	}
}
