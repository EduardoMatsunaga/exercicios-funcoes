import javax.swing.JOptionPane;
public class LT01_ModFun33 {
	public static void main (String args []) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		System.out.println("A série é: " + funsoma (n));
	}
	static double funsoma (int n) {
		double soma, i;
		soma = 0;
		for (i = 1; i <= n; i ++) {
			soma = soma + (1.0 / i);
		}
		return soma;
	}
}
