package Desafio;



import java.util.Scanner;
public class paulistinhaIuri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String times[] = {"CORINTHIANS" ,"Palmeiras  ", "SANTOS     ","SPFC       " };
		int rodada[][] = new int[4][4], x, vencedor;
		int pontos[] = new int[4];
		char vitoria;
		
		for (int i = 1; i < 5; i++) {
			System.out.printf("\n-----------RODADA %d ------------\n", i);
			System.out.println("TIMES \t\t\t RODADA \t PONTOS");
			for ( x = 0; x<4; x++) {
				System.out.println(times[x] + " \t\t " + i + " \t\t "+rodada[i-1][x]);
			}
			for( x = 0; x<4 ;x++){
				System.out.println("\nO time "+ times[x] +"\n1 - ganhou, 2 - perdeu ou 3 - empatou?");
				vitoria = input.next().charAt(0);
				if (vitoria == '1') {
					rodada[i-1][x] += 3;
					pontos[x]+= 3;
				} else if (vitoria == '2') {
					continue;
				} else {
					rodada[i-1][x]++;
					pontos[x]++;
				}
				
			}
		}
		System.out.println("-----------------------------");
		System.out.println("FIM DO PAULISTINHA\nRESULTADOS:");
		System.out.println("TIMES \t\t\t RODADA 1 \t RODADA 2 \t RODADA 3 \t RODADA 4 \t PONTOS");
		for ( x = 0; x<4; x++) {
			System.out.println(times[x] + " \t\t "
					+ rodada[0][x] + " \t\t "
					+ rodada[1][x] + " \t\t "
					+ rodada[2][x] + " \t\t "
					+ rodada[3][x] + " \t\t "
					+ pontos[x]);
			
		}
		
		vencedor = 0;
		for (x = 0; x < 4; x++) {
			if (pontos[x] > vencedor) {
				vencedor = x;
			}
		}
		System.out.println("O vencedor do campeonato é: " + times[vencedor]);
		
		
		input.close();		
	}
}