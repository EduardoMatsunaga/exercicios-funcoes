import javax.swing.JOptionPane;
public class LT01_ModFun40 {
	public static void main (String args []) {
		int n1, n2, maior, menor, i;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		if (n1 > n2) {
			maior = n1;
			menor = n2;
		}
		else {
			maior = n2;
			menor = n1;
		}
		System.out.println("Números primos entre " + menor + " e " + maior + ":");
		for (i = menor; i <= maior; i++) {
			if (i >= 2 && contarDivisores(i) == 0) {
				System.out.println(i);
			}
		}
	}

	static int contarDivisores (int num) {
		int contdiv = 0;
		int j;
		for (j = 2; j < num; j++) {
			if (num % j == 0) {
				contdiv += 1;
			}
		}
		return contdiv;
	}
}
