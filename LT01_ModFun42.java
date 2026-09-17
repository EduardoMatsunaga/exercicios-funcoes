import javax.swing.JOptionPane;
public class LT01_ModFun42 {
	public static void main (String args []) {
		double soma;
        int n,deno;
        soma = 0;
        deno = 0;
        n = 0;
        JOptionPane.showMessageDialog(null, "Soma da série: " + fracao (soma, n, deno));
	}
	static double fracao (double soma, int n, int deno) {
		for (n = 1; n<=50; n++) {
            deno = (2*n) -1;
            soma = soma + ((double) n / deno);
        }
		return soma;
	}
}
