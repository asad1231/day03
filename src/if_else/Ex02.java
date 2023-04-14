package if_else;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num > 10) {
			System.out.println("1.종속문장 실행!!!");
			System.out.println("2.종속문장 실행!!!");
			System.out.println("3.종속문장 실행!!!");
		}
			
		System.out.println("다음 문장들 실행...");
		
		System.out.println("수 입력");
		num = input.nextInt();
		String msg = null;
		if(num % 2 == 0) {
			//System.out.println("입력 값은 짝수 : " + num);
			msg = "입력값은 홀수 : ";
		}
		if(num % 2 != 0) {
			//System.out.println("입력 값은 홀수 : "+ num);
			msg = "입력값은 짝수 : ";
		}
		System.out.println(msg+ num);
		System.out.println("다음 문장들 실행~");
		
		// 수를 입력받아 입력받은 값을 절대값으로만 출력하세요
		// 절대값 |num| : 절대적으로 양의값. 부호가 없는 값
		
		int num1;
		System.out.println("수 입력 :");
		num1 = input.nextInt();
		if(num1 > 0) {
			System.out.println(num+"의 절대값 : "+num);
		}
		if(num1 < 0) {
			System.out.println(num+"의 절대값 : "+-num);
		}
		
	}
}
