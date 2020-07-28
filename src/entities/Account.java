package entities;

public class Account {
	
	private int number;
	private String holder;
	private double amount;
	
	
	public Account(int number, String holder, double amount) {
		super();
		this.number = number;
		this.holder = holder;
		this.amount = amount;
	}
	

	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
		}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public void withdraw(double amount) {
		this.amount -= amount+5;
	}
	
	public void deposit(double amount) {
		this.amount += amount;
	}
//metodos de adicionar ou tirar saldo

	@Override
	public String toString() {
		return "Account: "+ number +", Holder: " + holder +", Balance: $" + String.format("%.2f", amount);}
	
	
	
	
	
	

}
