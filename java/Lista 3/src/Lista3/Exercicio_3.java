package Lista3;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		

		int n1, n2, soma, tent = 0;
		
		System.out.println("Digite o primeiro numero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		n2 = leia.nextInt();
		
		while(n1<0) {
			System.out.println("\nO valor inserido é negativo, insira outro");
			System.out.println("\nDigite um valor positivo: ");
			n1 = leia.nextInt();
			tent = tent + 1;
			if(tent==3) {
				
				System.out.println("FIM");
				
			}
			break;
		}
		
		
		while(n2<0) {
			System.out.println("\nO valor inserido é negativo, insira outro");
			System.out.println("Digite um valor positivo pro segundo numero");
			n2 = leia.nextInt();
			tent = tent + 1;
				if(tent == 3) {
					
					System.out.println("FIM");
					
				}
			
		}
		
		
		
		soma = n1 + n2;
		
		while(n1> 0 && n2>0) {
			System.out.println("\nA Soma dos valores é:" +soma);
			break;
		}
		
		
		
		
		
		
		
	}

}
