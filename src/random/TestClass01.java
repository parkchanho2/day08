package random;

import java.util.Random;

public class TestClass01 {
	public static void main(String[] args) {
		//0.0 ~ 0.99 사이의 수를 뽑아준다.
		
		for(int i = 0; i < 5; i++) {
			double ran = Math.random();
			
			System.out.println(ran*3 + ", " + (int)(ran*3));
			System.out.println("===================");
			
			for(int j=0; j<5; j++) {
				int n = (int)(Math.random()*10 + 10);
				System.out.println(n);
			}
		}
		System.out.println("================");
		for(int i=0; i<5; i++) {
			System.out.println((int)(Math.random()*4));
		}
		System.out.println("================");
		Random ran = new Random();
		for(int i=0; i<5; i++) {
			System.out.println(ran.nextInt(5));
		}
	}
}
