package chap01;

import java.util.Scanner;

// Gauss sum
public class SumFor_Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : "); int n = sc.nextInt();
		int sum = 0;
		if(n%2 == 0) {
			sum = (n+1)*(n/2);
		}else {
			sum = (n+1)*(n/2) + (n+1)/2;
		}
		
		System.out.println(sum);
	}
}

/*
 * 더 깔끔하게 써 보기.
 * 
 * sum = (n+1)*(n/2) + (n%2 == 0? 0 : (n+1)/2);
 */
