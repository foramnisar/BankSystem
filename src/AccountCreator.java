import java.util.Scanner;

public class AccountCreator {
	public static void createAccount(String type)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your SSN: ");
		String ssn=input.nextLine();
		System.out.println("Please enter your initial deposits: ");
		double balance=input.nextDouble();
		
		if(type.equals("Checking"))
		{
			CheckingAccount obj=new CheckingAccount(ssn, balance, 10.0);
			BankSystem.allBankAccounts.add(obj);
		}
		if(type.equals("Saving"))
		{
			CheckingAccount obj=new CheckingAccount(ssn, balance, 10.0);
			BankSystem.allBankAccounts.add(obj);
		}
	}

}
