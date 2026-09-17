public class LT01_ModFun39 {
	public static void main (String args []) {
		int casa;
		long total;
		total = 0;
		for (casa = 1; casa <= 64; casa ++) {
			total = total + calcgraos(casa);
		}
		System.out.println("A quantidade de graos é: " + total);
	}
	static long calcgraos (int n) {
		long quantidade = 1;
		int i;
		for (i = 1; i < n; i ++) {
			quantidade = quantidade * 2;
		}
		return quantidade;
	}
}
