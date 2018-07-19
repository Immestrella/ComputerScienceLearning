package LOL;

public class Hero {
    
    String name; //姓名
     
    float hp; //血量
     
    float armor; //护甲
     
    int moveSpeed; //移动速度
 
    //回血
    public void huixue(int xp){
        hp = hp + xp;
        //回血完毕后，血瓶=0
        xp=0;
    }
    public Hero() {
        System.out.println("Hero的无参构造方法 ");
    }
    
    public Hero(String name) {
        System.out.println("Hero的有参构造方法 ");
        this.name = name;
    }
      
    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }
    
    public static void battleWin() {
    	System.out.println("hero battle win");
    }
    
    class BattleScore {
        int kill;
        int die;
        int assit;
 
        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
    }
 
    public static void main(String[] args) {
        Hero teemo =  new Hero("提莫",383);
        //血瓶，其值是100
        int xueping = 100;
         
        //提莫通过这个血瓶回血
         
        teemo.huixue(xueping);
         
        System.out.println(xueping);
         
    }  
}
