package hlsc.lao.javalearning;

public class Collectamount {

	public Integer collectedamount = 1000;

	public Integer collectamountandgiveittome() {
		System.out.println("collected amount "+collectedamount);
		return collectedamount;
	} 

	public static void checkamount() {
		Integer BCD =10;
	}
	
	
	public static void main(String[] args) {
		Collectamount amount = new Collectamount();
		Integer amt = amount.collectamountandgiveittome();
		System.out.println("Received amount "+amt);
	}
}
