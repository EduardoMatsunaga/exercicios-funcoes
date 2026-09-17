import javax.swing.JOptionPane;
public class LT01_ModFun38 {
	public static void main (String args []) {
		double numero, maior, menor;
		maior = 0;
		menor = 0;
		boolean primeiro = true;

		for (int i = 1; i <= 100; i++) {
			numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + i + "º número: "));

			if (numero > 0) {
				if (primeiro) {
					maior = numero;
					menor = numero;
					primeiro = false;
				} else {
					maior = calcularMaior(numero, maior);
					menor = calcularMenor(numero, menor);
				}
			}
		}

		System.out.println("O maior valor positivo foi: " + maior);
		System.out.println("O menor valor positivo foi: " + menor);
	}

	static double calcularMaior (double num, double maiorAtual) {
		if (num > maiorAtual) {
			return num;
		} else {
			return maiorAtual;
		}
	}

	static double calcularMenor (double num, double menorAtual) {
		if (num < menorAtual) {
			return num;
		} else {
			return menorAtual;
		}
	}
}