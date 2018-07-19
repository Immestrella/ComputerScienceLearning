package LOL;

public class SupportHero extends Hero implements Healer {
	public void heal() {
		System.out.println(name+"进行了一次治疗，但是不确定治疗了谁");
	}
	public void heal(Hero h) {
		System.out.println(name+"对"+h.name+"进行了一次治疗");
	}
	public void heal(Hero h,int hp) {
		System.out.println(name+"对"+h.name+"治疗了"+hp+"血量。");
	}
	public static void main(String[]args) {
		SupportHero SH = new SupportHero();
		SH.name = "奶妈";
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		h1.name = "盖伦";
		h2.name = "提莫";
		SH.heal();
		SH.heal(h1);SH.heal(h2);
		SH.heal(h1, 66);
	}
}
