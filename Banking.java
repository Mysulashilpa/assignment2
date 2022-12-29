 class Account {
	public long AccountNumber;
	public double balance;
	public String AccountHolder;

	public Account(long accountNumber, double balance, String accountHolder) {
		super();
		this.AccountNumber = accountNumber;
		this.balance = balance;
		this.AccountHolder = accountHolder;
	}

	public void deposit(double X) {
		balance = balance + X;
		System.out.println("Amount Deposited is "+X);
	}

	public void withdraw(double y) {
		balance = balance - y;

	}

	public long getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.AccountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountHolder() {
		return AccountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.AccountHolder = accountHolder;
	}

class Person 
 {
		private String name;
		private float age;

		public Person(String name, float age) {
			super();
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public float getAge() {
			return age;
		}

		public void setAge(float age) {
			this.age = age;
		}

	}
}





class SavingAccount extends Account 
{
	final double minimumbalance = 500;

	 SavingAccount(long accountNumber, double balance, String accountHolder)
             {
		super(accountNumber, balance, accountHolder);
		// TODO Auto-generated constructor stub
	}

	// TODO Auto-generated constructor stub
	public void withdraw(double y)
	{
		if( balance-y>=minimumbalance) 
		{   
			balance=balance-y;
			System.out.println("Amount Withdrawn..."+y);		
     	             }
		else
		{
			System.out.println("Insufficient Funds :");
		}
              }
}




class CurrentAccount extends Account
{
    public double overDraftLimit=-1000;
	public CurrentAccount(long accountNumber, double balance, String accountHolder)
    {
		super(accountNumber, balance, accountHolder);
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double y)
	{
		if(balance-y>=-1000)
		{
			balance=balance-y;
			System.out.println("Amount Withdrawn..."+y);		
     	             }
		else
		{
			System.out.println("Insufficient Funds :");
		}
	}
}



public class Banking
{
	public static void main(String[] args) 
            {
		SavingAccount SA1=new SavingAccount(1234,2000,"smith");
		SavingAccount SA2=new SavingAccount(4321,3000,"kathy");
		CurrentAccount CA1=new CurrentAccount(321,1000,"robert");
		SA1.deposit(2000);
		SA2.withdraw(2000);
		SA2.withdraw(2000);
		CA1.withdraw(2000);
		System.out.println(SA1.getBalance());
		System.out.println(SA2.getBalance());
		System.out.println(CA1.getBalance());
		CA1.withdraw(2);
		System.out.println(CA1.getBalance());
	}
}