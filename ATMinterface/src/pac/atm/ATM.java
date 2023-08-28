package pac.atm;

public class ATM extends BankAccount {

	public void Withdraw(int WithdrawAmmount) {
		if(getBalence()>WithdrawAmmount) {
		setBalence(getBalence()-WithdrawAmmount);
		}
		else System.out.println("Please Enter Valid Amount");
	}
	public void Deposit(int DepositAmmount) {
		setBalence(getBalence()+DepositAmmount);
	}
	public int  CheakBalence(){
		return getBalence();
	}
	
	
}
