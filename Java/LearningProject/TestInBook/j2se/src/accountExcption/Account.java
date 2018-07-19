package accountExcption;

public class Account {
	protected double balance;
	public Account() {
		this.balance=0;
	}
	public Account(double init) {
		this.balance=init;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amt) {
		balance += amt;
		System.out.println("����:"+amt+"$,"+"��"+balance);
	}
	public void withdraw(double amt) throws OverdraftException {
		if(this.balance<amt) {
			throw new OverdraftException("����",amt-this.balance);
		}
		balance -= amt;
		System.out.println("ȡ��:"+amt+"$,"+"��"+balance);
	}
}
