package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PhoneMain pm = new PhoneMain();
		System.out.println("집전화 통화");
		//pm.usePhone(s);
		//pm.useNokia(s);
		pm.useIphone(s);
	}

	private void useIphone(Scanner s) {
		Iphone iphone = new Iphone();
		iphone.setCompany("아이폰");
		System.out.println(iphone.getCompany()+"를 사용합니다");
		System.out.println("휴대폰으로 통화할 사람?");
		iphone.setDate(s.next(), s.next());
		System.out.println(iphone.getDate());
		
	}

	private void useNokia(Scanner s) {
		Phone nokia = new Celphon();
		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany()+"를 사용합니다");
		System.out.println("휴대폰으로 통화할 사람?");
		nokia.setCall(s.next());
		System.out.println(nokia.getCall());
	}

	private void usePhone(Scanner s) {
		Phone phone = new Phone();
		phone.setCompany("삼성집전화기");
		System.out.println(phone.getCompany()+"를 사용합니다");
		System.out.println("휴대폰으로 통화할 사람??");
		phone.setCall(s.next());
		System.out.println(phone.getCall());
	}
}
