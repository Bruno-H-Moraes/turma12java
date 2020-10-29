programa
{
	inclua biblioteca Matematica --> mat

	//3) Desenvolva um sistema em que:
//Leia 4 (quatro) números;
//Calcule o quadrado de cada um;
//Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
//Caso contrário, imprima os valores lidos e seus respectivos quadrados.


    inteiro num1, quad1, quad2,quad3,quad4
    inteiro num2
    inteiro num3
    inteiro num4
    
    
	funcao inicio()
	{
		escreva("Digite o numero A: ")
		leia(num1)
		escreva("Digite o numero B: ")
		leia(num2)
		escreva("Digite o numero C: ")
		leia(num3)
		escreva("Digite o numero D: ")
		leia(num4)


		quad1 = num1 ** 2
		quad2 = num2 ** 2
		quad3 = num3 ** 2
		quad4 = num4 ** 2

		se(quad3 >= 1000){
			escreva("O resultado do terceiro numero ao quadrado é:", quad3 )
		} senao escreva("O resultado dos outros numero ao quadrado é: ", quad1+" "+ quad2+" "+" "+ quad4)

		
		
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