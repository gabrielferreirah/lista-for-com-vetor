import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {

		String texto = "";
		int registro = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos preços serão cadastrados"));

		double[] precos = new double[registro];

		for (int i = 0; i < registro; i++) {

			precos[i] += Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço do produto"));

			for (int j = i; j <= i; j++) {
				texto += "Preço" + (i + 1) + ": " + precos[i];
				precos[i] += precos[i];
			}
			texto+="\n";
		}

	}