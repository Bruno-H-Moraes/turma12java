package Exercicios_Lista1;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String args[]) {
		
		
/*
 * Um sistema de equações lineares do tipo: 
, pode ser resolvido segundo mostrado abaixo : 
 

 */
		Scanner leia = new Scanner (System.in);
		
		
		int a, b, c, d, e, f, x, y, x1, x2, x3, x4, y1, y2, y3, y4;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de C: ");
		c = leia.nextInt();
		System.out.println("Digite o valor de D: ");
		d = leia.nextInt();
		System.out.println("Digite o valor de E: ");
		e = leia.nextInt();
		System.out.println("Digite o valor de F: ");
		f = leia.nextInt();
		
		x1 = c * e;
		x2 = b * f;
		x3 = a * e;
		x4 = b * d;
		
		x = (x1 - x2) / (x3 - x4);
		
		y1 = a * f;
		y2 = c * d;
		y3 = a * e;
		y4 = b * d;
		
		y =(y1 - y2) / (y3 - y4);
		
		
		System.out.println("O valor de X é:" + x + " " + "O valor de Y é: " + y + ".");
		
		
		
		
		
		
		
	}

}
