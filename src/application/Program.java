package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;



public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String holder;
		int number;
		int aux;
		double amount;
		Account account;
		
		System.out.print("Enter account number:");
		number = sc.nextInt();	
		System.out.print("Enter account holder:");
		sc.nextLine();
		holder = sc.nextLine();
		
		
		System.out.print("Is there an initial deposit (y/n)?");
		String answer = sc.next();
		if (answer.equals("y") || answer.equals("n")) {
			aux = 1;
		}
		else {
			aux = 0;
		}
		while (aux == 0)  {
			System.out.print("Invalid answer, please type y or n:");
			answer = sc.next();
			if (answer.equals("y") ||  answer.equals("n")) {
				aux = 1;
			}
			else {
				aux = 0;
			};
		};
		
		if (answer.equals("y") ) {
			System.out.print("Enter initial deposit value:");
			double initialDeposit = sc.nextDouble();
			
			account = new Account(number, holder, initialDeposit);
		}
		else {account = new Account(number, holder);
				};	
		
		System.out.println("Account Data:");	
		System.out.println(account.toString());
		
		System.out.print("Enter a deposit value: ");
		amount = sc.nextDouble();
		account.deposit(amount);
		System.out.println("Updated Data:");	
		System.out.println(account.toString());
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("Updated Data:");	
		System.out.println(account.toString());
		
		
	

		
		
		
		sc.close();

	}

}
