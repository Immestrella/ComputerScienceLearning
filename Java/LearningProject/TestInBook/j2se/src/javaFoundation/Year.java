package javaFoundation;
import java.util.Scanner;

public class Year {
	public void yearJudge() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入查询年份:");
		int year = s.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0) {
			System.out.println(year+"是闰年");
		}
		else {
			System.out.println(year+"是平年");
		}
	}
	public static void main(String[]args){
		Year Y = new Year();
		while(true){
			Y.yearJudge();
		}
	}
}
