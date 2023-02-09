package HelloWorld;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		
		String minhaVariavel = "Primeiro programa em Java";
		
		System.out.println(minhaVariavel);
		
		System.out.println("Nome:");
			String nomeLido = leitura.nextLine();
				System.out.println(nomeLido);

		System.out.println("Idade:");
			String idade = leitura.nextLine();
				int idade1 = Integer.valueOf(idade);
				System.out.println(idade1);
				
		System.out.println("Usuário " + nomeLido + " tem " + idade1 + " anos de idade.");
		
	}

}
