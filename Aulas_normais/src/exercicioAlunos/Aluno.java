package exercicioAlunos;

public class Aluno {

	private String nome;
	private int anoNascimento;
	private char genero;
	public boolean ativo;
	private int matricula;
	
	Aluno() {
		
	}
	
	
	private Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}




	String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	
	public String obterGenero() {
		
		String texto = "";
		if(this.genero == 'M') {
			texto = "Aluno";
		}else if (this.genero == 'F') {
			texto = "Aluna";
		}else if(this.genero == 'O') {
			texto = "Alune";
		}else {
			System.out.println("Opção Invalida");
		}
		
		return texto;
	}
	
	public int idade() {
		
		return 2020 - this.anoNascimento;
		
	}
	
	public int idade(int anoAtual) {
		
		return anoAtual - this.anoNascimento;
	}
	
	public void situacao() {
		this.ativo = true;
	}
	
	public void situacao(char status) {
	if(status == 'A') {
		this.ativo = true;
	} else {
		this.ativo = false;
	}
	}
	
	
}
