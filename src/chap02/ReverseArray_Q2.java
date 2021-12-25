package chap02;

import java.util.Scanner;

public class ReverseArray_Q2 {

	static void swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1]; a[idx1] = a[idx2]; a[idx2] = temp;
	}
	
	static void reverse(int[] a) {
		for(int i=0; i<a.length / 2; i++) {
			System.out.println("a["+i+"]와 a["+(a.length -i -1)+"]를 교환합니다.");
			swap(a, i, a.length -i -1);
			for (int j=0; j<a.length; j++) {
				System.out.printf("%2d", a[j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for (int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for (int i=0; i<num; i++) {
			System.out.println("x["+i+"] = " +x[i]);
		}
	}

}
