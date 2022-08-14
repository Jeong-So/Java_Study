package ch16;

public class SuperLevel extends PlayerLevel {

	@Override
	public void describe() {
		
		System.out.println("***** 고급자 레벨입니다. ******");
		
	}
	
	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump(int count) {
		for(int i = 0; i<count ; i++) {
			System.out.println("아주 높이 jump를 합니다.");
		}
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다");
		
	}

}
