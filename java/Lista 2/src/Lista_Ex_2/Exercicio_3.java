package Lista_Ex_2;

import java.util.Scanner;

public class Exercicio_3 {
	public static void main	(String args[]) {
		
		
		Scanner leia = new Scanner(System.in);
		
		
		/*
		 * 3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

		 */
		
		
		double num1;
		double num2, num3, num4;
		
		System.out.println("Digite o valor para o 1º numero: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o valor para o 2º numero: ");
		num2 = leia.nextInt();
		
		System.out.println("Digite o valor para o 3º numero: ");
		num3 = leia.nextInt();
		
		System.out.println("Digite o valor para o 4º numero: ");
		num4 = leia.nextInt();
		
		num1 = Math.pow(num1, 2);
		num2 = Math.pow(num2, 2);
		num3= Math.pow(num3, 2);
		num4 = Math.pow(num4,2);
		
		
		/*
		 * Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		 */
		
		
		if(num3 >= 1000) {
			System.out.println("O valor do 3º numero ao quadrado é: "+ num3);
		}else {
			System.out.println("O valor do 1º numero é:" + num1 + "O valor do 2º numero é: " + num2 + "O valor do 4º numero é: "+ num4);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
