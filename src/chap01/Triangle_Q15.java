package chap01;

import java.util.Scanner;

public class Triangle_Q15 {

	// 왼쪽 아래가 직각
	static void triangleLB(int n) {

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위가 직각인 이등변 삼각형
	static void triangleLU(int n) {

		for(int i=1; i<=n; i++) {
			for(int j=0; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 위가 직각인 이등변 삼각형
	static void triangleRU(int n) {

		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 아래가 직각인 이등변 삼각형
	static void triangleRB(int n) {

		for(int i=0; i<n; i++) {
			
			for(int j=1; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		triangleLB(n);
		triangleLU(n);
		triangleRU(n);
		triangleRB(n);
	}
}
