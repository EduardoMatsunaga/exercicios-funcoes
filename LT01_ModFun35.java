import javax.swing.JOptionPane;
public class LT01_ModFun35 {
	public static void main (String args []) {
		int a,b,maior, menor;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		if (a > b) {
			maior = a;
			menor = b;
		}
		else {
			maior = b;
			menor = a;
		}
		
		System.out.println("A soma dos impares é: " + funcaosoma(menor, maior));
	}
	static int funcaosoma(int men, int mai) {
		int soma, i;
		soma = 0;
		for (i = men; i <= mai; i ++) {
			if (i % 2 != 0) {
	            soma = soma + i;
	        }
		}
		return soma;
	}
}
