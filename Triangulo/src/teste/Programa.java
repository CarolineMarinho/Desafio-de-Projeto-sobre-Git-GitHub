package teste;

import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Atributos triangulo;
		 triangulo = new Atributos();
		 
		 String valorLadoUm = JOptionPane.showInputDialog("Digite o lado um valor:");
		 triangulo.setLadoUm(Double.parseDouble(valorLadoUm));
		 
		 String valorLadoDois = JOptionPane.showInputDialog("Digite o lado dois valor:");
		 triangulo.setLadoDois(Double.parseDouble(valorLadoDois));
		 
		 String valorLadoTres = JOptionPane.showInputDialog("Digite o lado tres valor:");
		 triangulo.setLadoTres(Double.parseDouble(valorLadoTres));
		 
		 
		 triangulo.verificarTipoTriangulo();
		 
	}

}
