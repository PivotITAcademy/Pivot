package classesnmethods;

public class BankAccount {
	
	double balance;
	
	String nextBilldate;
	
	
	
	public void getTotalBalance() {
		
		//Do complex calculations
		double totalBalance = getTSFAAccountBalance()+getRRSPBalance();
		System.out.println("Balance : "+totalBalance);
	}
	
	public double getTSFAAccountBalance() {
		
		double tsfaBalance = 400;//After some calaculations;
		return tsfaBalance;
	}
	
	public double getRRSPBalance() {
		return 1000;
	}
	
	
	public double depositMoneyinAccount(double money) {
		balance = balance +money;
		return balance;
	}
	
	public double getMoneyFromAccount(double minBalance,boolean isAccountActive, int maxTransactions, double withdrawalAmount) {
		
		double notes = 0.0;
		if(isAccountActive && maxTransactions <5 && minBalance>withdrawalAmount ) {
			notes = withdrawalAmount;
		}else {
			System.out.println("One or more condition is not satisfied");
		}
		
		return  notes;
	}

}
