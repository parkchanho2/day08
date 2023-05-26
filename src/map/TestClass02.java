package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestClass02 {
	public static void main(String[] args) {
	//	HashMap<String, String> map = new HashMap<>();
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		map.put("선풍기", " 100만원");
		map.put("에어컨", " 10만원");
		map.put("자동차", " 20만원");
		System.out.println(map);
		
		System.out.println("에어컨가격:" + map.get("에어컨"));
		
		System.out.println(map.keySet()); // key 만 가져옴
		System.out.println(map.values()); // 벨류값만 가져옴
		Set<String> key = map.keySet();
		Iterator<String> it = key.iterator();
		
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k + ": " + map.get(k));
		}
//		String k = it.next();
//		System.out.println(k + ":" + map.get(k));
//		k = it.next();
//		System.out.println(k + ":" + map.get(k));
//		k = it.next();
//		System.out.println(k + ":" + map.get(k));
	}
}
