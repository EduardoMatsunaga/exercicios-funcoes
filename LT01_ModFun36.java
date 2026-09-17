import javax.swing.JOptionPane;
public class LT01_ModFun36 {
	public static void main (String args []) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		System.out.println("Série: " + fsoma(n));
	}
	static double fsoma(int n) {
		double soma, i, fat;
		soma = 1;
		fat = 1;
		for (i = 1; i <=n; i++) {
			fat = fat * i;
			soma = soma + (1.0 / fat);
		}
		return soma;
	}
}
