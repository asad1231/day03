package operator;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 삼항 연산자(조건연산자)
		 (조건식) ? 참인경우 실행 : 거짓인경우 실행;
		 */
		int su;
		su=8;
		String s = (su%2 ==0)?"짝수" : "홀수";
		System.out.println(su+":"+s);
		
		s = (su%3 ==0)? "3의 배수" : "3의배수 아님";
		System.out.println(s);
		
		int a;
		System.out.print("수 입력 : ");
		a = input.nextInt();
		String s1 = (a%2 ==0)?"짝수" : "홀수";
		System.out.println(a + " = " + s1);
		s1 = (su%3 == 0)? "3의배수": "3의 배수가 아니다";
		System.out.println(a + " = " + s1);
		int num1,num2;
		System.out.print("두 수 입력 :");
		num1 = input.nextInt();
		num2 = input.nextInt();
		System.out.println("num1 : " + num1 + " ,num2 : " + num2);
		s1 = (num1 > num2)? "num1이 num2보다 크다" : "num2가 num1보다 크다";
		System.out.println(s1);
	}
}
