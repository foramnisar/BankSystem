import java.text.DecimalFormat;
import java.util.ArrayList;

public abstract class BankAccount {
	private static int nextAccountNum=100001;
	
	//attributes of BankAccount class
	private String ssn;
	private String accountNum;
	private double balance;
	private ArrayList<String> statement=new ArrayList<>();
	
	//constructor
	public BankAccount(String s,double b)
	{
		ssn=s;
		balance=b;
		accountNum=""+ nextAccountNum;
		nextAccountNum++;
		
		//create the first activity of the statement
		DecimalFormat df=new DecimalFormat("##.00");
		statement.add((DateAndTime.DateTime()+ ": Account opened with an initial deposit of $"+ df.format(balance)));
	}
	
	//deposit method and withdraw method
	
	public void deposit(double amount)
	{
		if(amount >0.0)
		{
			balance=balance+amount; //update the balance
			//update the statement
			DecimalFormat df=new DecimalFormat("##.00");
			statement.add(DateAndTime.DateTime()+":Deposit $"+ df.format(amount)+". New Balance: $"+df.format(balance));
		}
	}
	
	public void withdraw(double amount)
	{
		if(balance-amount>=0.0) //to check if it has enough moeny to withdraw
		{
			balance=balance-amount; //update the balance
			//update the statement
			DecimalFormat df=new DecimalFormat("##.00");
			statement.add(DateAndTime.DateTime()+":Withdraw $"+ df.format(amount)+". New Balance: $"+df.format(balance));
		}
	}
	

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList<String> getStatement() {
		return statement;
	}

	public void setStatement(ArrayList<String> statement) {
		this.statement = statement;
	}
	
	

}
