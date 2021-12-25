package chap02;

import java.util.Scanner;

public class ArrayCopy {

	static int[] copy(int[] a) {
		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];

		}
		return b;
	}
	
	static int[] rcopy(int[] a) {

		int[] b = new int[a.length];
		for(int i=0; i<a.length; i++) {
			b[a.length - i -1] = a[i];
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("[" + i + "] 의 값 : ");
			a[i] = sc.nextInt();
		}
		int[] b;
		System.out.println("a의 값을 b에 복사합니다");
		b = copy(a);
		System.out.print("b 배열의 값은 : ");
		for(int i=0; i<b.length; i++) {

			System.out.printf("%2d", b[i]);
		}
		System.out.println();
		System.out.println("a의 값을 b에 역순으로 복사합니다");
		b = rcopy(a);
		System.out.print("b 배열의 값은 : ");
		for(int i=0; i<b.length; i++) {

			System.out.printf("%2d", b[i]);
		}
	}

}
