package trabalhoTI;

public class Teste {

	public static void main(String[] args) {

		Professor prof = new Professor();
		Aluno al = new Aluno();
		
		prof.setCpf("1111111111");
		prof.setNome("Evertton");
		prof.setEndereco("rua embaixador assis chatealbriand");
		prof.setTelefone("99999-9999");
		prof.setDepartamento("pessoal");
		prof.setNomeCurso("TI");
		prof.setSalario(2500.00);
		
		System.out.println(prof.toString());
		
		
		al.setCpf("7657655");
		al.setNome("nnljhvvjr");
		al.setEndereco("rua embaixador assis chatealbriand");
		al.setTelefone("99999-9999");
		
		for(int i = 0; i<al.getCurso().length; i++) {
			
			
			String curso= "curso "+(i+1)+ "º";
			
			al.setCursoPos(i, curso);
		}
		
		for (int i = 0; i < al.getNota().length; i++) {
			
			// System.out.println("Obtendo notas da disciplina " +(i+1));
			
			
			
			for(int j = 0; j<al.getNota()[i].length; j++) {
				double nota = 7 +i;
				
				al.setNotaPos(i,j,nota);
			}
		}
		
		System.out.println("\n"+al.toString());
	}

}
