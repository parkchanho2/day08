package random;

public class Quiz03 {
	public static void main(String[] args) {
		
		String code = "";
		for(int i=0; i<6; i++) {
			if(Math.random()<0.5) {
				code += (char)(int)(Math.random()*26 + 'A');
			}else {
				code +=(char)(int)(Math.random()*26 + 'a');
			}
		}
		System.out.println(code);
	}
}
