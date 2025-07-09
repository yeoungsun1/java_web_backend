package user;
//2번 : User클래스의 객체를 만들 UserMain 클래스
public class UserMain {
	public static void main(String[] args) {
		//클래스명 객체명 = new 생성자();
		User user1 = new User("짱구", 5, "gu", "a123");
		System.out.println(user1); //user.User@279f2327
		System.out.println(user1.name);

		User user2 = new User("철수", 5, "su", "su123");
		System.out.println(user2); //user.User@2ff4acd0
		System.out.println(user2.name);
		
		//객체명.필드명 = 값;
//		user1.name = "짱구";
//		System.out.println(user1.name);
		
		
	}
}
