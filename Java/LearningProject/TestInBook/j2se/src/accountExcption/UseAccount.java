package accountExcption;

public class UseAccount {
	public static void main(String[]args) {
		Account me = new Account(1000);
		Account you = new Account();
		System.out.println(me.balance);
		me.deposit(90);
        try {
            //取2001
            me.withdraw(2001);
        } catch (OverdraftException e) {
            System.err.println("透支金额："+e.getDeficit());
            e.printStackTrace();
        }
		System.out.println(you.balance);
		you.deposit(1002);
        try {
            //取2001
            you.withdraw(2001);
        } catch (OverdraftException e) {
            System.err.println("透支金额："+e.getDeficit());
            e.printStackTrace();
        }
        CheckingAccount he = new CheckingAccount(1000,1000);
        he.deposit(200);
        try {
            //取2001
            he.withdraw(2500);
        } catch (OverdraftException e) {
            System.err.println("信用卡已透支金额："+e.getDeficit());
            e.printStackTrace();
        }
     
	}
}
