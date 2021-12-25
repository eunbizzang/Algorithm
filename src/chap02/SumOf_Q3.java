package chap02;

import java.util.Scanner;

public class SumOf_Q3 {

	static void sumOf(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("배열의 모든 요소의 합계 : " + sum);
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		for(int i = 0; i < num; i++) {
			System.out.println("배열 x의 x[" + i + "] 의 값 : ");
			x[i] = sc.nextInt();
		}
		sumOf(x);
	}
}
