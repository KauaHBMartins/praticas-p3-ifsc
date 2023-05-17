package ifsc;

public class PessoaMainA {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.nome = "Joãozin";
		p.cpf = 12345678900l;
		p.nasciemnto = "06/02/2002";
		
		System.out.println("O nome do usuário é : " + p.nome);
		System.out.println("O cpf do usuário é ; " + p.cpf);
		System.out.println("A data de nascimento do usuário é  : " + p.nasciemnto);
	}

}
