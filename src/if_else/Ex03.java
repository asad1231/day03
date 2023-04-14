package if_else;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값, 합계와 평균을 구해보자.
		Scanner input = new Scanner(System.in);
		
		int a,b,c;
		System.out.print("정수 3개 입력 : ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		int max = a;
		int min = a;
		
		if(a < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		if(a > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		
		int sum = a+b+c;
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum/3.0));
		
	}
}
