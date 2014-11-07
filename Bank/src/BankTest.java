
public class BankTest {
public static void main(String[] args){
	BankAccount kevin = new BankAccount(1234, "kevin");
	BankAccount khumps = new BankAccount(5000, 4321, "khumps");
	System.out.println(kevin.getBal());
	kevin.deposit(500);
	
	System.out.println(kevin.getBal());
	kevin.withdraw(50);
	System.out.println(kevin.getBal());
	System.out.println(khumps.getBal());
	khumps.transfer(2000, kevin);
	System.out.println(kevin.getBal());
	System.out.println(khumps.getBal());
}
}