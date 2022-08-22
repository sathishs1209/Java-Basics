package hlsc.lao.javalearning;

public class Bankaccount extends Collectamount {

	Long accountnumber = 12345678901l;
	String name = "ABCDE";
	int accountbalance = 350;
	
	public void getBalance() {
		System.out.println("Account balance is "+accountbalance);
	}
	
	public static void main(String[] args) {
		Bankaccount account = new Bankaccount();
				account.collectamountandgiveittome();
				account.;
	}
	
	
	
}
