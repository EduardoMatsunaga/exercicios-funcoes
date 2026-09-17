import javax.swing.JOptionPane;
public class LT01_ModFun34 {
	 public static int calcularMultiplicacao(int numero, int i) {
	        int resultado;
	        resultado = numero * i;
	        return resultado;
	    }

	    public static void main(String args[]) {
	        int numero;

	        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + calcularMultiplicacao(numero, i));
	        }
	    }
	}