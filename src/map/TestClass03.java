package map;

import java.util.HashMap;
import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		String key, value;
		System.out.println("저장할 키 입력: ");
		key = sc.next();
		System.out.println("저장할 값 입력: ");
		value = sc.next();
		
		map.put(key, value);
		System.out.println(map);
		
		System.out.println("찾는 키 입력: ");
		key = sc.next();
		if(map.containsKey(key) == false) {
			System.out.println("존재하지 않습니다");
		}else {
			System.out.println(key + ": " + map.get(key));
		}
		
		
		System.out.println("--------------");
		String result = map.get(key);
		if(result == null) {
			System.out.println("존재하지 않는다");
		}else {
			System.out.println(key + ": " + result);
		}
	}
}
