/*
 * Create and manage bank accounts
 */
public class BankAccount {
	
	private double balance; //Balance of the BankAccount
	private int pin; //Pin of BankAccount
	private String name; //Name of BankAccount

	public BankAccount(int pin, String name) //Used to create a new BankAccount with a balance of 0
	{
		this.balance = 0;
		this.pin = pin;
		this.name = name;
	}
	
	public BankAccount(double balance, int pin, String name) //Used to create a new BankAccount with a balance of balance
	{
		this.balance = balance;
		this.pin = pin;
		this.name = name;
	}
	
	public void deposit(double deposit) //Deposits $deposit into BankAccount
	{
		this.balance += deposit;
	}
	
	public void withdraw(double withdraw) //Withdraws $withdraw from BankAccount
	{
		this.balance -= withdraw;
	}
	
	public double getBal() //Returns balance of BankAccount
	{
		return this.balance;
	}
	
	public void transfer(double amt, BankAccount receive) //Transfers money from BankAccount to receive BankAccount
	{
		this.balance -= amt;
		receive.balance += amt;
	}
	
	public String getName()
	{
		return name;
	}
}
