package Lista3;

import java.util.Scanner;

public class triangulos {

	public static void main(String[] args) {
		
		// triangulo precisa de base e altura e calculamos a area = base*altura
		
				Scanner leia = new Scanner(System.in);
				double base1, altura1, base2, altura2, area1, area2;
				
				System.out.println("Base do triangulo 1: ");
				base1 = leia.nextDouble();
				while(base1<=0) {
					System.out.println("Numero negativo, tente de novo:");
					System.out.println("Base do triangulo 1: ");
					base1 = leia.nextDouble();
				}
				System.out.println("Altura do triangulo 1: ");
				altura1 = leia.nextDouble();
				while(altura1<=0) {
					System.out.println("Numero negativo, tente de novo:");
					System.out.println("Altura do triangulo 1: ");
					altura1 = leia.nextDouble();
				}
				area1 = (base1 * altura1)/2;
				
				System.out.println("Base do triangulo 2: ");
				base2 = leia.nextDouble();
				while(base2<=0) {
					System.out.println("Numero negativo, tente de novo:");
					System.out.println("Base do triangulo 2: ");
					base2 = leia.nextDouble();
				}
				System.out.println("Altura do triangulo 2: ");
				altura2 = leia.nextDouble();
				while(altura2<=0) {
					System.out.println("Numero negativo, tente de novo:");
					System.out.println("Altura do triangulo 2: ");
					altura2 = leia.nextDouble();
				}
				area2 = (base2 * altura2)/2;
				
				System.out.println("TRIANGULO 1");
				System.out.println("Base :"+base1);
				System.out.println("Altura:"+altura1);
				System.out.println("Area:"+area1);
				System.out.println();
				
				System.out.println("TRIANGULO 2");
				System.out.println("Base :"+base2);
				System.out.println("Altura:"+altura2);
				System.out.println("Area:"+area2);
				System.out.println();
				if (area1> area2)
				{
					System.out.println("A maior area é do triangulo 1");
				} else if (area1 < area2) {
					System.out.println("A maior area é do triangulo 2");
				} else {
					System.out.println("Triangulos 1 e 2 areas iguais");
				}
					
			}
		}