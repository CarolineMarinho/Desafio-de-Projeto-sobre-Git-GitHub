package teste;

public class TesteObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario;
		funcionario = new Funcionario();
		
		funcionario.setNome("Luca");
		funcionario.setSexo("Masculino");
		funcionario.setIdade(20);
		funcionario.setCargo("Gerente de todo mundo");
		
		System.out.println("Nome do funcionário: " + funcionario.getNome() +
				"\nSexo:  " + funcionario.getSexo() +
				"\nIdade: " + funcionario.getIdade() +
				"\nCargo: " + funcionario.getCargo()
		);
		
		Morador morador;
		morador = new Morador();
		
		morador.setNome("Claudião");
		morador.setSexo("Masculino");
		morador.setIdade(36);
		morador.setApartamento(210);
		
		System.out.println("\nNome do morador: " + morador.getNome() +
				"\nSexo:  " + morador.getSexo() +
				"\nIdade: " + morador.getIdade() +
				"\nApartamento: " + morador.getApartamento());

	}

}
