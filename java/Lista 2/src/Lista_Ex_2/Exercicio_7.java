package Lista_Ex_2;

import java.util.Scanner;

public class Exercicio_7 {
	public static void main (String args[]) {
		
		
		Scanner leia = new Scanner(System.in);
		/*
		 * 7) Receber valores de base e altura de um triângulo e 
		 * verificar se são valores válidos 
		 * (positivos maiores que zero). 
		 * Em caso afirmativo, calcular a área do triângulo.
		 */
		
		int base = 0;
		int altura = 0;
		int area = 0;
		
		System.out.println("Digite o valor da Base: ");
		base = leia.nextInt();
		
		System.out.println("Digite o valor da Altura: ");
		altura = leia.nextInt();
		
		if(base < 0) {
			System.out.println("O Valor precisa ser positivo");
			}
			
		if(altura < 0) {
			System.out.println("O valor precisa ser positivo");
			
		}
		
		
		area = ((base * altura)/2);
		System.out.println("A area do tringulo é: "+ base);
			
		
		
		
		
		
		
		
	}

}
