package Lista3;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		/*
		 * Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o
m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
		 */
				
		
		int x = 0, soma = 0, totalImpares = 0;
		
		System.out.println("O valor de 500, sera o limite da contagem de multiplos de 3");
		
		for(x=1; x<=500; x++) {
			if((x%2!=0) && (x%3==0)) {
				soma = soma + x;
						totalImpares = totalImpares + x;
			}
		}
			System.out.println("\nO total de impares �: " + totalImpares);
	}

}
