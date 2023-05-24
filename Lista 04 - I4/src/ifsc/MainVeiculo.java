package ifsc;

public class MainVeiculo {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo();
		v.setNome("Opala");
		v.setCor("Preto");
		v.setAno(1976);
		
		System.out.println("o veiculo é " + v.getNome());
		System.out.println("Cor: " + v.getCor());
		System.out.println("Ano é " + v.getAno());
	}

}
