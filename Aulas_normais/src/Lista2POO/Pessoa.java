package Lista2POO;

public class Pessoa {
	private String nome;
	private String enderešo;
	private  String telefone;
	
	
	public Pessoa ()
	{
		
	}
	public Pessoa(String nome, String enderešo, String telefone) {
		
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
	}
	
	
	public Pessoa(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return enderešo;
	}
	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
	
	
	
}