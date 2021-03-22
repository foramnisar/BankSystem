import java.text.DecimalFormat;

public class SavingAccount extends BankAccount {
	
	private int numberofWithdraw=0; //at the beginning, it it 0
	private double overWithdrawFee=10.0;
	
	//constructor
	public SavingAccount(String s, double b)
	{
		super(s, b);		
	}
	//override the withdraw method
	@Override
	public void withdraw(double amount)
	{
		//why override? because in the saving account, the withdraw method is different than the other bank account method
		//there is an over withdraw fee that may be charged
		if(super.getBalance()-amount>=0.0) //to check if it has enough money to withdraw
		{
			super.setBalance(super.getBalance()-amount);//update the balance
			//update the statement
			DecimalFormat df=new DecimalFormat("##.00");
			super.getStatement().add(DateAndTime.DateTime()+": Withdraw $"+ df.format(amount)
			+". New Balance: $"+df.format(super.getBalance()));
			//update for the fee
			if(numberofWithdraw>=1)
			{
				super.setBalance(super.getBalance()-overWithdrawFee);//withdraw fee charged
				super.getStatement().add(DateAndTime.DateTime()+": $"+ df.format(overWithdrawFee)
				+"is charged. New Balance: $"+df.format(super.getBalance()));
			}
			//update the number of withdraw
			numberofWithdraw++;
		}
	}

}
