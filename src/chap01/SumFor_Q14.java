package chap01;

import java.util.Scanner;

public class SumFor_Q14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int type = sc.nextInt();
		
		for(int i=1; i<= type; i++) {
			for(int j=1; j<= type; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
