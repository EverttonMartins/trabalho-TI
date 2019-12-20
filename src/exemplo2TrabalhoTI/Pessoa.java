package exemplo2TrabalhoTI;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String usuario;
	private String senha;
	
	public Pessoa () {
		
	}
	
	public Pessoa (String nome, String endereco, String telefone, String cpf, String usuario, String senha) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.usuario = usuario;
		this.senha = senha;
		
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
		
		
		
		
	}
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String info() {		
		return "\nnome= " + nome 
				+ "\nendereco= " + endereco 
				+ "\ntelefone= " + telefone 
				+ "\ncpf= " + cpf ;
	}
	
}
