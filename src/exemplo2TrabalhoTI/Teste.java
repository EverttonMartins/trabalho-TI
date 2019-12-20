package exemplo2TrabalhoTI;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Professor prof = new Professor();
		Aluno al = new Aluno();
		int digito = 0;

		prof.setCpf("1111111111");
		prof.setNome("Evertton");
		prof.setEndereco("rua embaixador assis chatealbriand");
		prof.setTelefone("99999-9999");
		prof.setDepartamento("pessoal");
		prof.setNomeCurso("TI");
		prof.setSalario(2500.00);
		prof.setUsuario("evertton");
		prof.setSenha("123");

		try {

		do {
			System.out.println("USUÁRIO:");
			String usuario = scan.nextLine();

			System.out.println("SENHA:");
			String senha = scan.nextLine();

			if ((usuario.equalsIgnoreCase(prof.getUsuario()) && senha.equals(prof.getSenha()))
					|| (usuario.equalsIgnoreCase(al.getUsuario()) && senha.equals(al.getSenha()))) {

				System.out.println("\n\nACESSO PERMITIDO!!");

				if (usuario.equalsIgnoreCase(prof.getUsuario()) && senha.equals(prof.getSenha())) {
					System.out.println(prof.toString());// isso é provisorio

				} else {
					System.out.println("\n" + al.toString());

				}
				break;

			} else {
				System.out.println("\n\n....................ACESSO NEGADO!!....................."
						+ "\n\nTENTE NOVAMENTE OU FAÇA UM CADASTRO." + "\n\nPARA CADASTRAR DIGITE 1"
						+ "\n\nPARA TENTAR NOVAMENTE DIGITE 2");

				digito = scan.nextInt();
				scan.nextLine();

				if (digito != 2) {

					System.out.println("DIGITE 1 PARA CADASTRAR UM PROFESSOR");
					System.out.println("OU 2 PARA CADASTAR UM ALUNO:");
					int digito2 = scan.nextInt();
					scan.nextLine(); // apenas o nextLine remove o caracter de nova linha (gerado pelo seu Enter) da
										// stream de entrada

					if (digito2 == 1) {
						System.out.println("DIDGITE O NOME:");
						prof.setNome(scan.nextLine());

						System.out.println("DIGITE O TELEFONE:");
						prof.setTelefone(scan.nextLine());

						System.out.println("DIGITE O ENDEREÇO:");
						prof.setEndereco(scan.nextLine());

						System.out.println("DIGITE O CPF:");
						prof.setCpf(scan.nextLine());

						System.out.println("DIGITE O NOME DO CURSO:");
						prof.setNomeCurso(scan.nextLine());

						System.out.println("DIGITE O DEPARTAMENTO:");
						prof.setDepartamento(scan.nextLine());

						System.out.println("DIGITE O SALÁRIO:");
						prof.setSalario(scan.nextDouble());
						scan.nextLine();

						System.out.println("DIGITE O NOME DO USUÁRIO PARA EFETUAR LOGIN:");
						prof.setUsuario(scan.nextLine());

						System.out.println("DIGITE A SENHA:");
						prof.setSenha(scan.nextLine());

						digito = 2;

					} else {

						System.out.println("DIGITE O NOME:");
						al.setNome(scan.nextLine());

						System.out.println("DIGITE O CPF:");
						al.setCpf(scan.nextLine());

						System.out.println("DIGITE O ENDEREÇO:");
						al.setEndereco(scan.nextLine());

						System.out.println("DIGITE O TELEFONE:");
						al.setTelefone(scan.nextLine());

						System.out.println("DIGITE O NOME DO USUÁRIO PARA EFETUAR LOGIN:");
						al.setUsuario(scan.nextLine());

						System.out.println("DIGITE A SENHA:");
						al.setSenha(scan.nextLine());

						for (int i = 0; i < al.getCurso().length; i++) {

							String curso = "curso " + (i + 1) + "º";

							al.setCursoPos(i, curso);
						}

						for (int i = 0; i < al.getNota().length; i++) {

							// System.out.println("Obtendo notas da disciplina " +(i+1));

							for (int j = 0; j < al.getNota()[i].length; j++) {
								double nota = 7 + i;

								al.setNotaPos(i, j, nota);
							}
						}

						digito = 2;
					}
				}

			}

		} while (digito == 2);
		
		}catch(Exception erro) {
			System.out.println("OCORREU UM ERRO: " + erro);
		}

		scan.close();

	}
}
