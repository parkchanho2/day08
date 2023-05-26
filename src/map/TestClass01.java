package map;

import java.util.HashMap;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		 Map - HashMap
		 - key, value형식으로 만들어진다.
		 - 순서는 유지되지 않는다.
		 - 원하는 값을 얻고자 하는 경우 key를 통해서 얻어온다
		 - 키의 중복은 허용되지 않으며 value는 중복 가능 
		 */
		
		HashMap<String, String> map = new HashMap<>();
		map.put("num", "100");
		map.put("name","홍길동");
		map.put("addr", "산골짜기");
		
		System.out.println(map);
		
		String n = map.get("num");
		System.out.println(n);
		System.out.println(map.get("name"));
		System.out.println(map.get("addr"));
		System.out.println(map.get("없는키"));
		
		System.out.println("키가 존재하는 가: " + map.containsKey("aaaa"));
		
		System.out.println("\n===========================");
		map.put("name", "김개똥");
		map.put("name1", "김개똥");
		System.out.println(map);
		
		System.out.println("=== name1 삭제 ===");
		map.remove("name1"); // 삭제 
		System.out.println(map);
	}
}



















