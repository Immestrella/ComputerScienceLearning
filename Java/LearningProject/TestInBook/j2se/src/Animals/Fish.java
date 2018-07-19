package Animals;

public class Fish extends Animal implements Pet {
	private String name;
	public Fish() {
		super(0);
	}
	@Override
	public void walk() {
		System.out.println("鱼不走路");
	}
	public void eat() {
		System.out.println("鱼不吃饭");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void play() {
		System.out.println("鱼不玩耍");
	}
}
