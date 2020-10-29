programa
{
	cadeia nomeUsuario
	inteiro anoNascimento
	inteiro idadeUsuario
	
	funcao inicio()
	{
		escreva("Digite o numero do Usuario: ")
		leia(nomeUsuario)
		escreva("Digite o ano de nascimento: ")
		leia(anoNascimento)


		idadeUsuario = 2020 - anoNascimento

		se(idadeUsuario < 18){
			escreva("Vocé é menor de idade")
			} senao{
				escreva("Voce é maior de idade")}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */