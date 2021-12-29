package chap03;

import java.util.Scanner;

public class BinSearch_Q2 {

	// book ver
	static int seqSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		for (int i = 0; i < n; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[i] == key)
				return i; // 검색성공
		}
		return -1; // 검색실패
	}

	// binary ver
	static int binSearch(int[] x, int num, int key) {
		int pl = 0;
		int pr = num - 1;
		
		do {
			int pc = (pl + pr)/2;
			if(x[pc] == key) {
				return pc;
			} else if (x[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pc -1;
			}
		} while (pl <= pr);
		return -1;
	}
	
	// 각 행의 맨 왼쪽에 현재 검색하는 요소의 인덱스를 출력
	// 현재 검색하고 있는 요소 위에 별표 기호를 출력
	static int seqSearch(int[] x, int num, int key) {
		
		System.out.print(" |");
		for(int i=0; i<num; i++) {
			System.out.printf("%2d", x[i]);
		}
		System.out.println();
		System.out.println("-+-----------------");
		
		int check = -1;
		for(int i=0; i<num; i++) {
			
			System.out.print(" |");
			for(int j=0; j<i; j++) {
				System.out.print("  ");
			}
			System.out.println(" *");
			System.out.print(i + "|");
			for(int d=0; d<num; d++) {
				System.out.printf("%2d", x[d]);
			}
			System.out.println();
			if(x[i] == key) {
				check = i;
			}
		}
		return check;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("배열의 값을 오름차순으로 입력하시오.");
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();

		for(int i=1; i<num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = sc.nextInt();
			} while (x[i-1] > x[i]);
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		System.out.println("선형검색 결과");
		int seq = seqSearch(x, num, key);
		
		if(seq == -1) {
			System.out.println("검색한 값이 없습니다.");
		}else {
			System.out.println("검색한 값은 x[" + seq + "]에 들어있음");
		}
		
		System.out.println("바이너리 검색 결과.");
		int bin = binSearch(x, num, key);
		
		if(bin == -1) {
			System.out.println("검색한 값이 없습니다.");
		}else {
			System.out.println("검색한 값은 x[" + bin + "]에 들어있음");
		}
		
		System.out.println("책 버전 검색 결과.");
		int book = seqSearchEx(x, num, key);
		
		if(book == -1) {
			System.out.println("검색한 값이 없습니다.");
		}else {
			System.out.println("검색한 값은 x[" + book + "]에 들어있음");
		}
	}

}

// book ver
