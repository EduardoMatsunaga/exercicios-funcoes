import javax.swing.JOptionPane;
public class LT01_ModFun37 {
	public static void main (String args []) {
		int n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		System.out.print("Série de fibonacci: " + fibonacci(n));
	}
	static int fibonacci (int n) {
		int  fibo, ant, pos, i;
		fibo = 1;
		ant = 0;
		for (i = 1; i <= n; i ++) {
			pos = fibo + ant; 
			ant = fibo;
			fibo = pos;
		}
		return fibo;
	}
}
