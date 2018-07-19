package LOL;

public class SingleHero {
    String name; //姓名  
    float hp; //血量     
    float armor; //护甲
    int moveSpeed; //移动速度
	private SingleHero() {
	}
	private static SingleHero instance = new SingleHero();
	public static SingleHero getInstance () {
		return instance;
	}
}
