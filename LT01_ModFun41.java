public class LT01_ModFun41 {
	public static void main (String args []) {
		int d1, d2;
		for (d1 = 1; d1 < 7; d1++) {
			for (d2 = 1; d2 < 7; d2++) {
				if (soma(d1, d2) == 7) {
					System.out.println(d1 + "+" + d2 + " = 7");
				}
			}
		}
	}

	static int soma (int a, int b) {
		int s;
		s = a + b;
		return s;
	}
}