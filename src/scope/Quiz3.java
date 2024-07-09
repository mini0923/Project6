package scope;

public class Quiz3 {

	public static void main(String[] args) {

		Person person = new Person();	// main 함수 끝나기 전까지
		
		int i = 10;	// main 함수 끝나기 전까지
		
		if (i > 1) {
			String str = "안녕하세요";		// if 문이 끝나기 전까지
			System.out.println(str);
		}
		
		for (int k = 0; k <10; k++) {	// for 문이 끝나기 전까지
			System.out.println(k);	
		}

		
		
	}

}
