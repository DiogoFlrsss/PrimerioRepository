package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasse {

//	Método auto executável
	public static void main(String[] args) {

		/* new Aluno() é uma instância (Criação de objeto) */
		/* aluno1 é uma refêrencia para o objeto Aluno */
		Aluno aluno1 = new Aluno(); /* Aqui será o João */

		aluno1.setNome("João da Silva");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("12/01/2005");
		aluno1.setRegistroGeral("342432.34234");
		aluno1.setNumeroCpf("600.682.443.23");
		aluno1.setNomeMae("Diandra");
		aluno1.setNomePai("Flavio");
		aluno1.setDataMatricula("21/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Jdev treinamento");

		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);

		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é " + aluno1.getIdade());
		System.out.println("Data de nascimento " + aluno1.getDataNascimento());
		System.out.println("Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());

		/* ====================================================================== */

//		Agora temos um objeto real na memória
		Aluno aluno2 = new Aluno(); /* Aqui será o Pedro */

		System.out.println("==============================");

		aluno2.setNome("Pedro");
		aluno2.setIdade(19);
		aluno2.setDataNascimento("12/01/2010");

		System.out.println("Nome é = " + aluno2.getNome());
		System.out.println("Idade é " + aluno2.getIdade());
		System.out.println("Data de nascimento " + aluno2.getDataNascimento());

		Aluno aluno3 = new Aluno(); /* Aqui será o Diogo */

		Aluno aluno4 = new Aluno("Maria");

//		Objeto ainda não existe na memória
		Aluno aluno5;

	}

}