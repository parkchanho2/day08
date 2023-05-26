package random;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		String menu =null;
		String price = null;
		
		while(true) {
		System.out.println("1.메뉴 등록");
		System.out.println("2.메뉴별 가격보기");
		System.out.println("3.종료");
		
			switch(sc.nextInt()) {
			case 1:
				System.out.println("등록할 메뉴 입력: ");
				menu = sc.next();
				if(map.containsKey(menu)==true) {
					System.out.println("이미 등록되어 있습니다.");
					continue;
				}
				System.out.println("등록할 가격 입력: ");
				price = sc.next();
				map.put(menu, price);
				System.out.println("등록완료");
				break;
			case 2:
				Iterator it = map.keySet().iterator();
				if(it.hasNext() == true) {
					while(it.hasNext()) {
						menu = (String)it.next();
						System.out.println(menu + ": " + map.get(menu));
					}
				}else {
					System.out.println("등록한 메뉴가 없습니다.");
					continue;
				}
				System.out.println("1.수정 | 2.삭제 | 3. 나가기");
				System.out.print(">>>");
				switch(sc.next()) {
				case "1":
					System.out.println("현재 등록된 메뉴는" + map.keySet() + "입니다.");
					System.out.println("수정할 메뉴: ");
					menu = sc.next();
					if(map.containsKey(menu) == false) {
						System.out.println("해당 메뉴가 존재 하지 않음");
						continue;
					}else {
						System.out.println("수정하실 가격: ");
						price = sc.next();
						map.replace(menu, price);
						System.out.println("수정되었습니다");
						continue;
					}
				case "2":
					System.out.println("삭제할 메뉴 입력: ");
					menu = sc.next();
					if(map.containsKey(menu) == false) {
						System.out.println("해당 메뉴가 없습니다.");
					}else {
						map.remove(menu);
						System.out.println("삭제 완료");
						continue;
					}
				default:
					System.out.println("이전으로 돌아갑니다");
					continue;
				}
			case 3:
				System.out.println("프로그램 종료");
				System.exit(0);
				
			}break;
		}
		
			
	}
}
