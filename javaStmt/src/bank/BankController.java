package bank;

import java.util.Scanner;

public class BankController {
	public static void main(String[] args) {
		BankServiceImpl bsi = new BankServiceImpl();
		Scanner s = new Scanner(System.in);
		
		System.out.println("[메뉴] 1.개설 2.입금 3.출금 4.잔액조회 0.종료 ");
		switch (s.nextInt()) {
		case 1:
			System.out.println("성명과 암호를 입력하시오");
			bsi.openAccount(s.next(), s.nextInt());	
			break;
		case 2:bsi.deposit(s.nextInt());
			break;
		case 3:bsi.withdraw(s.nextInt());
			break;
		case 4:bsi.findMoney();
			break;
		case 0:
			System.out.println("종료");
			return;
		default:
			System.out.println("잘못 입력하였습니다.");
			return;
		}
	}
}
