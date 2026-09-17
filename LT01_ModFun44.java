import javax.swing.JOptionPane;
public class LT01_ModFun44 {
	public static void main (String args []) {
		int base, exp;
		base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base: "));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente: "));
        JOptionPane.showMessageDialog(null, "Valor da potencia: " + potencia(base, exp));
	}
	static double potencia (int base, int exp) {
		double pot;
		pot = Math.pow(base, exp);
		return pot; 
	}
}
