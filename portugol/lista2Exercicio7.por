programa
{
	/*
	 * 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	 * (positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.

	 */

	 inteiro base
	  inteiro altura
	  inteiro area
	  inteiro bas
	  inteiro alt
	  
	 
	funcao inicio()
	{
		escreva("Digite a base do seu triangulo:" )
		leia(base)
		escreva("Digite a altura do seu triangulo: ")
		leia(altura)

		se(base<0){
			escreva("Não aceitamos numero menor que 0")
		}



		se(altura<0){
			escreva("Não aceitamos numeros negativos")
		}

		escreva("sua area é ",((base * altura)/2))

		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */