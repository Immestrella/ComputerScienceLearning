package LOL;

public class SingleHero {
    String name; //����  
    float hp; //Ѫ��     
    float armor; //����
    int moveSpeed; //�ƶ��ٶ�
	private SingleHero() {
	}
	private static SingleHero instance = new SingleHero();
	public static SingleHero getInstance () {
		return instance;
	}
}
