package teste;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite a op��o:"
				+ "\n\n1 para instanciar um objeto do tipo professor"
				+ "\n2 para instanciar um objeto do tipo funcionario"));

		if(valor == 1)
		{
			Professor professor;
			professor = new Professor();
			
			professor.setNome(JOptionPane.showInputDialog("Digite o nome do professor:"));
			professor.setCurso(JOptionPane.showInputDialog("Digite o curso do professor:"));
			
			System.out.println("O nome do professor �: " + professor.getNome() +
					"\nCurso do professor: " + professor.getCurso());

			else
			{
				Funcionario funcionario;
				funcionario = new Funcionario();
				
				funcionario.setNome(JOptionPane.showInputDialog("Digite o nome do funcion�rio:"));
				funcionario.setArea(JOptionPane.showInputDialog("Digite a �rea do funcion�rio:"));
				
				System.out.println("O nome do funcion�rio �: " + funcionario.getNome() +
						"\nSetor do funcion�rio: " + funcionario.getArea());	

	}

}
