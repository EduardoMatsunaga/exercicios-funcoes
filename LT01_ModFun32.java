import javax.swing.JOptionPane;
public class LT01_ModFun32 {
	public static void main (String args []) {
		int x;
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		System.out.println("O fatorial é: " + funcaofatorial(x));
	}
	static long funcaofatorial (int n) {
		long fat = 1;
		for (int i = 1; i <= n; i++) {
	        fat = fat * i;
	    }
	    return fat;
	}
}
