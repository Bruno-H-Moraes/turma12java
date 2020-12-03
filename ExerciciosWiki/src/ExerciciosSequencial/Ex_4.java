package ExerciciosSequencial;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		int med1 = 0;
		int med2 = 0;
		int med3 = 0;
		int med4 = 0;
		
		int media = 0;
		
		System.out.println("Digite o valor da primeira media: ");
		med1 = leia.nextInt();
		
		
		System.out.println("Digite o valor da segundo media: ");
		med2 = leia.nextInt();
		
		System.out.println("Digite o valor da terceira media: ");
		med3 = leia.nextInt();
		
		
		System.out.println("Digite o valor da quarta media: ");
		med4 = leia.nextInt();
		
		media = (med1 + med2 + med3 + med4)/4;
		
		System.out.println("A media do aluno é:" + media);
		
		
		
		
		
		
		
		
		
		
	}

}
