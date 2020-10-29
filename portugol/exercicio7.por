programa
{
	inteiro a, b, c, d, ed, f, x, y, x1, x2, y1, y2
	inteiro x3, x4, y3, y4
	funcao inicio()
	{
		escreva("Digite o valor de A: ")
		leia(a)
		escreva("Digiteo valor de B: ")
		leia(b)
		escreva("Digite o valor de C: ")
		leia(c)
		escreva("Digite o valor de D: ")
		leia(d)
		escreva("Digite o valor de E: ")
		leia(ed)
		escreva("Digite o valor de F: ")
		leia(f)


		x1 = (c * ed)
		x2 = (b * f)
		x3 = (a * ed)
		x4 = (b * d)
		x = (x1 - x2) / (x3 - x4)
		escreva("O valor de X é: ", x)

		
		y1 = (a * f)
		y2 = (c * d)
		y3 = (a * ed)
		y4 = (b * d)
		y = (y1 - y2) / (y3 - y4)
		escreva("O valor de Y é: ", y)


		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 548; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */