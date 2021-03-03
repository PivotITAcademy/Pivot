package classesnmethods;

public class OnlineBankPortalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount tdBankAccount = new  BankAccount();
		//tdBankAccount.getTotalBalance();
		
		double withdrawalAmount = tdBankAccount.getMoneyFromAccount(500, true, 3, 600);
		System.out.println("Amount Withdrawn : "+withdrawalAmount);
	}

}
