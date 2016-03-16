package ifelse;

import java.util.Scanner;

/**
 * @file TimeCalc.java
 * @author USER
 * @date 2016. 3. 11.
 * @story 사칙연산기
 */
public class TimeCalc {
	public static void main(String[] args) {
	String  sign = "";
	int num1 = 0, num2 = 0, hap = 0;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("숫자와 연산기호 기호를 차례대로 입력하시오.");
	num1 = scanner.nextInt();
	sign = scanner.next();
	num2 = scanner.nextInt();
	
		if(sign.equals("+")){
			hap=num1+num2;
			System.out.println(num1+"+"+num2+"="+hap);
		} else if(sign.equals("-")){
			hap=num1-num2;
			System.out.println(num1+"-"+num2+"="+hap);
		}else if (sign.equals("*")) {
			hap = num1 * num2;
			System.out.println(num1+"*"+num2+"="+hap);
		}else {
			hap = num1 / num2;
			System.out.println(num1+"/"+num2+"="+hap);
		}

	}
}
