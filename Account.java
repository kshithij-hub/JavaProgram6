package bankdetails;

public class Account {
	int accountNo;
	String name;
	double balance;
	
	public Account(int accountNo,String name,double balance ) {
		this.accountNo=accountNo;
		this.name=name;
		this.balance=balance;
		
		}
	public void deposit( double amount) {
		if(amount<=0) {
			throw new ArithmeticException("Deposit amount must be positive");
		}
		balance+=amount;
		System.out.println("Amount deposited sucessfully");
		System.out.println(" Balance now:"+balance);
	}
	public void withdraw (double amount) throws InsufficientBalanceException
	{
		if (amount<=0) {
			throw new ArithmeticException("please enter positive withdrawnal amount");
			
			
		}
		if(amount>balance) {
			throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
		}
		balance-=amount;
		System.out.println("withdrawnal is successful");
		System.out.println("Remaining balance:"+ balance);
	}
	public void ShowBalance()
	{
		System.out.println("ACCOUNT HOLDER NAME is:"+name);
		System.out.println("ACCOUNT NUMBER is:"+ accountNo);
		System.out.println("Your current balance is:"+balance);
		
	}

}
