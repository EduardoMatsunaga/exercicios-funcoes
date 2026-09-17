import javax.swing.JOptionPane;
public class LT01_ModFun45 {
	public static void main (String args []) {
		double soma = 0;
        int sinal = 1;
        JOptionPane.showMessageDialog(null, "A soma da série é: " + fracao (soma, sinal));
	}
	static double fracao (double soma, int sinal) {
		for (int n = 1; n <= 15; n++) {
            double termo = (double) n / (n * n);
            soma = soma + (sinal * termo);
            sinal = sinal * (-1);
        }
		return soma;
	}
}
