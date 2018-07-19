package Animals;

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		this.legs=legs;
	}
	public void walk() {
		System.out.println("该动物用"+legs+"条腿走路");
	}
	public abstract void eat();
}
