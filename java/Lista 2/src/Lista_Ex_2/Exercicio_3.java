package Lista_Ex_2;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main	(String args[]) {
		
		
		Scanner leia = new Scanner(System.in);
		
		
		/*
		 * 3) Desenvolva um sistema em que:
Leia 4 (quatro) n�meros;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.

		 */
		
		
		double num1;
		double num2, num3, num4;
		
		System.out.println("Digite o valor para o 1� numero: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o valor para o 2� numero: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite o valor para o 3� numero: ");
		num3 = leia.nextInt();
		
		System.out.println("Digite o valor para o 4� numero: ");
		num4 = leia.nextInt();
		
		num1 = Math.pow(num1, 2);
		num2 = Math.pow(num2, 2);
		num3= Math.pow(num3, 2);
		num4 = Math.pow(num4,2);
		
		
		/*
		 * Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contr�rio, imprima os valores lidos e seus respectivos quadrados.
		 */
		
		
		if(num3 >= 1000) {
			System.out.println("O valor do 3� numero ao quadrado �: "+ num3);
		}else {
			System.out.println("O valor do 1� numero �:" + num1 + "O valor do 2� numero �: " + num2 + "O valor do 4� numero �: "+ num4);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
