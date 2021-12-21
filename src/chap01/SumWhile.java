package chap01;

import java.util.Scanner;

public class SumWhile {

	// while문이 종료 될 때 변수 i 값이 i+1이 됨을 확인(변수 i값을 출력하도록 프로그래밍)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합");
		System.out.print("n : "); int n = sc.nextInt();
		
		int sum = 0;
		
		int i = 1;
		
		while(i<=n) {
			sum = sum + i;
			i++;
		}
		System.out.println("1부터 " + n + "까지의 합은 : " + sum );
		System.out.println("i : " + i);
	}
}
