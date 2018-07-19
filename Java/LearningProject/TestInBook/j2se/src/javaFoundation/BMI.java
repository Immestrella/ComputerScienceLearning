package javaFoundation;
import java.util.Scanner;

public class BMI {
	public void BmiJudge(float weight,float height) {
		double BMI = weight/(height*height);
		if(BMI<18.5) {
			System.out.println("您体重过轻");
		}
		else if(18.5<=BMI && BMI<24){
			System.out.println("体重正常");
		}
		else if(24<=BMI && BMI<27){
			System.out.println("体重过重");
		}
		else if(27<=BMI && BMI<30){
			System.out.println("轻度肥胖");
		}
		else if(30<=BMI && BMI<35){
			System.out.println("中度肥胖");
		}
		else{
			System.out.println("重度肥胖");
		}
	}
	public static void main(String[]args) {
		BMI test = new BMI();
		Scanner s = new Scanner(System.in);
		System.out.println("Please input ur weight(kg)");
		float a = s.nextFloat();
		System.out.println("Please input ur height(m)");
		float b = s.nextFloat();
		System.out.println("Confirm that ur weight is "+ a 
				+" and ur height is "+ b);
		test.BmiJudge(a, b);
	 
 }
}
