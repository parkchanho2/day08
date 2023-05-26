package random;

import java.util.Scanner;

public class TestClass02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1, n2;
		System.out.print("문자열 입력: ");
		n1 = sc.nextLine(); //공백 받으려면 nextLine 써야함
		
		
		System.out.print("문자열 입력: ");
		n2 = sc.nextLine();
		
		
		System.out.println(n1);
		System.out.println(n2);
	}
}
