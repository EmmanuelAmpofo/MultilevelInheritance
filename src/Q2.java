class Account{
	String customerName;
	String accountNo;
	
	Account(String customerName,String accountNo){
		this.customerName = customerName;
		this.accountNo = accountNo;
		
	}
	
	void display() {
		 System.out.println(customerName+" "+accountNo);
	}
	
}

class SavingsAccount extends Account{
	double minBalance;
	double savingBalance;

	SavingsAccount(String customerName, String accountNo,double minBalance,double savingBalance) {
		super(customerName, accountNo);
		this.minBalance = minBalance;
		this.savingBalance = savingBalance;
		
	}
	void display() {
		 System.out.println(customerName+" "+accountNo+" "+minBalance+" "+savingBalance);
	}
		
}

class AccountDetails extends SavingsAccount{
	double deposit;
	double withdraw;

	AccountDetails(String customerName, String accountNo, double minBalance, double savingBalance,double deposit,double withdraw) {
		super(customerName, accountNo, minBalance, savingBalance);
		this.deposit = deposit;
		this.withdraw = withdraw;
	}
	void display() {
		 System.out.println("Customer Name: "+customerName);
		 System.out.println("Customer Account Number: "+accountNo);
		 System.out.println("Minimum Balance: "+minBalance);
		 System.out.println("Savings Balance: "+savingBalance);
		 System.out.println("Deposit: "+deposit);
		 System.out.println("Withdraw: "+withdraw);
	}
	
	
}



public class Q2 {
	

	public static void main(String[] args) {
				 
		
		AccountDetails account = new AccountDetails("Amalitech Training","#00233",100.2,50,500,150);
		
		account.display();
		
		
		

	}

}
