package Animals;

public class Fish extends Animal implements Pet {
	private String name;
	public Fish() {
		super(0);
	}
	@Override
	public void walk() {
		System.out.println("�㲻��·");
	}
	public void eat() {
		System.out.println("�㲻�Է�");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println("�㲻��ˣ");
	}
}
