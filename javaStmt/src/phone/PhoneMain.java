package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("집전화 통화");
		//usePhone(s);
		Phone nokia = new Celphon();
		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany());
		System.out.println("휴대폰으로 통화");
		nokia.setCall(s.next());
		System.out.println(nokia.getCall());
	}

	private static void usePhone(Scanner s) {
		Phone phone = new Phone();
		phone.setCompany("삼성집전화기");
		System.out.println(phone.getCompany()+"를 사용합니다");
		System.out.println("통화할 사람?");
		phone.setCall(s.next());
		System.out.println(phone.getCall());
	}
}
