package Lista3;

import java.util.Scanner;

public class exercicio_1_v01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		/*
		 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		 *  coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00. 

		 */

		
		double mediaSalario = 0, mediaFilhos = 0, maiorSalario = 0, percentual = 0, salario = 0, totalSalario = 0.0;
		
		int filhos = 0, totalFilhos = 0, x = 0, menor100 = 0, QTD = 0;
		
		System.out.println("Digite a quantidade de entrevistados: ");
		QTD = leia.nextInt();
		
		for(x=1; x<=QTD; x++) {
			System.out.println("Digite o valor do salario do entrevistado: ");
			salario = leia.nextFloat();
					if(salario <100) {
						menor100 = menor100 + 1;
						
						totalSalario = totalSalario + 1;
						System.out.println("Digite o numero de filhos: ");
						filhos = leia.nextInt();
						
						
						 }
						
					totalFilhos = totalFilhos + 1;
					 if(maiorSalario < salario) {
						 maiorSalario = salario;
						 
					}
		}
		
		
			
		while(filhos < 0) {
			System.out.println("Filhos nao podem ser negativos.");
			filhos = leia.nextInt();
			
		}
		
		 
		 System.out.println("Quantidade de entrevistados: " + QTD);
		 mediaSalario = totalSalario / QTD;
		 mediaFilhos = totalFilhos / QTD;
		 percentual = menor100*100/QTD;
		 System.out.println("\nMedia Salario: " + mediaSalario);
		 System.out.println("\nTotal de Filhos: "+ totalFilhos);
		 System.out.println("\nMedia de filhos: "+ mediaFilhos);
		 System.out.println("\nMaior Salario: "+maiorSalario);
		 System.out.println("\nPessoas que recebem menos de 100: "+percentual+"%");
		 
		 
		 
		 
		 
		
		
	}

}
