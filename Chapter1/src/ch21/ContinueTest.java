package ch21;

public class ContinueTest {

	public static void main(String[] args) {

		int i;
		
//		for(i = 1 ; i <= 100; i++) {
//			
//			if (i%3 == 0) {
//				System.out.println(i);
//			}
//		}
		
		for(i = 1 ; i <= 100; i++ ) {
			
			if(i%3 != 0) continue;
			
			System.out.println(i);
		}
		
	}

}
