public class LT01_ModFun43 {
	public static void main (String args []) {
		double maria, ana;
		int anos;
		anos = 0;
		maria = 1.5;
		ana = 1.1;
		System.out.println("Serão necessários " + idade (anos, maria, ana) + " para Ana ser maior que Maria.");
	}
	static int idade (int anos, double maria, double ana) {
		while (ana < maria) {
			ana += 0.03;
			maria +=0.02;
			anos +=1;
		}
		return anos;
	}
}
