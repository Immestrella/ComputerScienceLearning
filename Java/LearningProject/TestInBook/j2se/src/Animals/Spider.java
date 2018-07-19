package Animals;

public class Spider extends Animal {
	public Spider() {
		super(8);
	}
	@Override
	public void eat() {
		System.out.println("Spider eat sth");
	}
	public static void mian(String[]args) {
		new Spider().walk();
	}
}
