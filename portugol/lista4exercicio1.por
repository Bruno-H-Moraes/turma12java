programa {


funcao inicio()
	{
		inteiro pontuacao[5], 
		inteiro mP = 0
		
		para( inteiro x=0 ; x<5; x++)
		{
			escreva("digite um valor: ")
			leia(pontuacao[x])
			se(pontuacao[x] > mP)
			{
				mP = pontuacao[x]
			}
		}

		limpa()
		escreva("A maior pontuação foi ", mP)
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */