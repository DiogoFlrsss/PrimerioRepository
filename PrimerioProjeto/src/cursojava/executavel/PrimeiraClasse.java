package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasse {

//	Método auto executável
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno(); /* Aqui será o João */

//		Agora temos um objeto real na memória
		Aluno aluno2 = new Aluno(); /* Aqui será o Pedro */
		
		Aluno aluno3 = new Aluno(); /*Aqui será o Diogo*/
		
		Aluno aluno5 = new Aluno("Maria");
		
		Aluno aluno6 = new Aluno("Diogo", 50);
		
		Aluno aluno7 = new Aluno("Diogo Flores", "Eva Carminatti");
		
		System.out.println(aluno7);
		
		

//		Objeto ainda não existe na memória
		Aluno aluno4;

	}

}
