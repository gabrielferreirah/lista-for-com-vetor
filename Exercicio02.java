import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {

		String texto = "";
		int[] idades = new int[7];
		int i = 0;

		for (i = 0; i < idades.length; i++) {

			idades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade"));
			for (int j = i; j <= i; j++) {
				texto += "Idade 0" + (i + 1) + ": " + idades[i];
				System.out.println(idades[i]);
			}
			texto += "\n";
		}
		JOptionPane.showMessageDialog(null, texto);

	}

}