package escola;

public class Escola {
	public static void main(String[] args) {
		// criação de um objeto
		Aluno felipe = new Aluno();
		
		// criação dos valores dos atributos do objeto
		felipe.nome="Felipe";
		felipe.idade = 8;
		
		System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos ");
		//RESULTADO NO CONSOLE
		//O aluno Felipe tem 8 anos 		
	}

}
