package javaFoundation;

public class GodenFenge {
	public static void main(String[]args) {
		double d=21,c=0.000,a=0,b=0;
		for(double i=1;i<21;i++) {
			for(double j=1;j<21;j++) {
				if(i<j) {
					c=Math.abs(i/j-0.618);
					if(c<d){
						d=c;a=i;b=j;
						}
					}
				}
			}
		System.out.println(a+" "+b+" "+d);
		}
	}

