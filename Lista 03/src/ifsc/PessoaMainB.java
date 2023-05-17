package ifsc;

import java.util.Scanner;

public class PessoaMainB {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		Pessoa[] pessoas = new Pessoa[3];
		
		for (int i = 0; i < pessoas.length; i++) {
			Pessoa p = new Pessoa();
			System.out.println("Digite o nome :");
			p.nome = leitura.nextLine();
			System.out.println("Digite o CPF : ");
			p.cpf = leitura.nextLong();
			System.out.println("Digite a data de nascimento : ");
			p.nasciemnto = leitura.nextLine();
		}
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("O nome do usuário é " + pessoas[i].nome + " o cpf do usuário é de " + pessoas[i].cpf + "e a data de nascimento é " + pessoas[i].nasciemnto);	
		}
	}

}
