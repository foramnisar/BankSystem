import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
	
	//we need to keep checking account and saving account we create
	//also we create online account
	//so we need to create arrayList to keep these objects
	public static ArrayList<BankAccount> allBankAccounts= new ArrayList<BankAccount>();
	public static ArrayList<OnlineAccount> allOnlineAccounts= new ArrayList<OnlineAccount>();

	public static void main(String[] args) {		
		
		//what is the benefit of polymorphsm?
		//allow programming in more general than more specific
		
		//suppose after complete this program, it runs for some time already
		//later, if we decide to provide a product of CreditCard account, and define creditAccount as a subclass of bank account
		//will we need to change the source code right here? I mean
		
		//main menu
		
		Scanner input=new Scanner(System.in);
		String selection="";
		while(!selection.equals("x")) //while not x, keep displaying the menu			
		{
			//display the menu
			System.out.println("Please make your selection: ");
			System.out.println("1: Open a new checking account");
			System.out.println("2: Open a new savings account");
			System.out.println("3: Go to online system");
			System.out.println("x: Finish");
			
			//get the selection from the user
			selection=input.nextLine();
			System.out.println();
			
			//based on the input, go to different function
			if(selection.equals("1"))
			{
				//open new bank structure
				AccountCreator.createAccount("Checking");
			}
			else if(selection.equals("2"))
			{
				//go to the online system
				AccountCreator.createAccount("Saving");
			}
			else if(selection.equals("3"))
			{
				//online Systems
			}
			else if(selection.equals("d"))
			{
				for(BankAccount b: allBankAccounts)
				{
					if(b instanceof CheckingAccount)
					{
						System.out.println("Checking Account: ");
						System.out.println(b.getAccountNum());
						System.out.println(b.getSsn());
						System.out.println(b.getBalance());
					}
				}
			}
		}

	}

}
