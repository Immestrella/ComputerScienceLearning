package LOL;

public class SupportHero extends Hero implements Healer {
	public void heal() {
		System.out.println(name+"������һ�����ƣ����ǲ�ȷ��������˭");
	}
	public void heal(Hero h) {
		System.out.println(name+"��"+h.name+"������һ������");
	}
	public void heal(Hero h,int hp) {
		System.out.println(name+"��"+h.name+"������"+hp+"Ѫ����");
	}
	public static void main(String[]args) {
		SupportHero SH = new SupportHero();
		SH.name = "����";
		Hero h1 = new Hero();
		Hero h2 = new Hero();
		h1.name = "����";
		h2.name = "��Ī";
		SH.heal();
		SH.heal(h1);SH.heal(h2);
		SH.heal(h1, 66);
	}
}
