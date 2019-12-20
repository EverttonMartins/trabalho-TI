package exemplo2TrabalhoTI;

import java.util.Arrays;

public class Aluno extends Pessoa {

	private String matricula;
	private String curso[] = new String [3] ;
	private double nota[][] = new double [3][4];



	public double calcularMedia(int indice) {
		double soma = 0;

		for (int i = 0; i <= nota.length; i++) {
			soma += nota[indice][i];
		}
		double media = soma / 4;

		return media;
	

	}

	public boolean verificarAprovacao(int indice) {
		
		if(calcularMedia(indice) >= 7) {
			return true;
		}
		return false;	
		}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String[] getCurso() {
		return curso;
	}

	public void setCursoPos(int pos, String curso) {
		this.curso[pos] = curso;
	}

	public double[][] getNota() {
		
		return nota;
	}
	

	public void setNotaPos(int posI, int posJ, double nota) {
		this.nota[posI][posJ] = nota;
	}

	@Override
	public String toString() {
		return "Aluno \n\nmatricula= " + matricula 
				+ "\ncurso= " + Arrays.toString(curso) 
				+ "\nnota= " + Arrays.toString(nota) + super.info();
	}

}
