package javaFoundation;

public class Begger {
	public static void main(String[]args){
		int a=1,j=0;
		for(int i=0;i<10;i++) {
			j+=a;
			a*=2;
			System.out.println("乞丐第"+(i+1)+"天一共讨到了"+j+"元。");
		}
		System.out.println("乞丐十天一共讨到了"+j+"元。");
	}
}
