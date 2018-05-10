import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		String[] nomes = new String[25];
		int i = 0;
		for (i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog(null, "Digite seu nome");
			for (int j = i; j <= i; j++) {
				System.out.println(nomes[i]);
			}
		}

	}

}
