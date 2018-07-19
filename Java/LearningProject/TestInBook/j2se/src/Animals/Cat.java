package Animals;

public class Cat extends Animal implements Pet {
	String name;
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	public Cat() {
		this("");
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void eat() {
		System.out.println("������");
	}
	public void play() {
		System.out.println("������");
	}
}
