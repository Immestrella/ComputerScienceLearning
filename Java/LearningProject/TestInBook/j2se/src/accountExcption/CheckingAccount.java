package accountExcption;

public class CheckingAccount extends Account {
	private double overdraftProtection;
	public CheckingAccount(double balance) {
		this.balance = balance;
		this.overdraftProtection = 0;
	}
	public CheckingAccount(double init,double protect) {
		this.overdraftProtection = protect;
		this.balance = init;
	}
	@Override
	public void withdraw(double amt) throws OverdraftException {
		if(this.balance-amt+overdraftProtection<0) {
			throw new OverdraftException("����,�������÷�Χ",amt-this.balance-overdraftProtection);
		}
		balance -= amt;
		System.out.println("ȡ��:"+amt+"$,"+"��"+balance);
	}
	
}
