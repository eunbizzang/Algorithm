package chap01;

import java.util.Scanner;

public class SumFor_Q11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
		System.out.print("n : "); 
		n = sc.nextInt();
		} while(n < 0);
		
		int check = 0;
		while(n > 0) {
			n = n / 10;
			check ++;
		}
		System.out.println("n = " + check + "자리수");
	}

}
