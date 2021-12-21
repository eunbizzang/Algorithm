package chap01;

import java.util.Scanner;

// if n=7, print 1+2+3+4+5+6+7 = 28
public class SumFor_Q7 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 n: "); int n = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i!=1) {
				System.out.print("+");
			}
			sum = sum + i;
			System.out.print(i);
		}
		System.out.println("=" + sum);
	}
}
