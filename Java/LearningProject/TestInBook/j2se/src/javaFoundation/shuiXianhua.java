package javaFoundation;

public class shuiXianhua {
	public static void main(String[]args) {
		for(long i=1;i<10;i++) {
			for(long j=1;j<10;j++) {
				for(long k=1;k<10;k++) {
					if(i*i*i+j*j*j+k*k*k==100*i+10*j+k) {
						System.out.println("ˮ�ɻ�����"+i+""+j+""+k);
					}
				}
			}
		}
	}
}
