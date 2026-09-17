public class LT01_ModFun31 {
	public static void main (String args []) {
		int i,quadrado;
		for (i = 10; i <= 150; i ++) {
				quadrado = calc (i);
				System.out.println("O quadrado de " + i + " é: " + quadrado);
		}
	}
	static int calc (int n) {
		return n * n;
	}
}
