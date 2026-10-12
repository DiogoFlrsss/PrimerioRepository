package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasse {

//	Método auto executável
	public static void main(String[] args) {

		/* new Aluno() é uma instância (Criação de objeto) */
		/* aluno1 é uma refêrencia para o objeto Aluno */
		Aluno aluno1 = new Aluno(); /* Aqui será o João */
		aluno1.nome = "João";
		aluno1.idade = 50;

		System.out.println("Nome do aluno 1 é: " + aluno1.nome);
		System.out.println(aluno1.idade);
//		Agora temos um objeto real na memória
		Aluno aluno2 = new Aluno(); /* Aqui será o Pedro */

		Aluno aluno3 = new Aluno(); /* Aqui será o Diogo */

		Aluno aluno4 = new Aluno("Maria");

//		Objeto ainda não existe na memória
		Aluno aluno5;

	}

}