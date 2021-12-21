package chap01;

import java.util.Scanner;

public class SumFor_Q10_forver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a : "); int a = sc.nextInt();
		
		int b = 0;
		while(true) {
			
			System.out.print("b : "); b = sc.nextInt();
			if(a > b) break;
			System.out.println("a 보다 큰 값을 입력하시오.");;
		}
		System.out.println("b-a : " + (b-a));
	}

}
