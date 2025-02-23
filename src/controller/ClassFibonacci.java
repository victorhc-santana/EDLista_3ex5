package controller;

public class ClassFibonacci {
	public ClassFibonacci() {
		super();
	}
	
	public int EncontraPosicao(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		}
		else {
			return EncontraPosicao(n-1) + EncontraPosicao(n-2);
		}
	}
}
