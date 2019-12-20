package exemplo2TrabalhoTI;


public class Professor extends Pessoa {
	
	
	/* trabalhando com encapsulamento, melhor organização e proteção de dados,
	 * evitando acesso indevido.*/

	private String departamento;
	private String nomeCurso;
	private double salario;

	public Professor () {
	}
	
	
	public Professor(String nome, String endereco, String telefone, String cpf, String usuario, String senha) {
		super(nome, endereco, telefone, cpf, usuario, senha);
		
	}




	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calcularSalario(double salario) {
		return 0;
		
		
	}
	@Override
	public String toString() {
		return "Professor \n\ndepartamento= " + departamento 
				+ "\nnomeCurso= " + nomeCurso 
				+ "\nsalario= R$ " + salario + super.info();
	}

	
	

}
