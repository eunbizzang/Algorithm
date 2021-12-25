package chap01;

import java.util.Scanner;

public class Triangle_Q16 {

	static void spira(int n) {
		
		for(int i=1; i<=n; i++) {
			
			int time = (i-1)*2 + 1;
			
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			
			for(int j=1; j<=time; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		spira(n);
	}

}


/*
 * 4
    *
   ***
  *****
 ********/