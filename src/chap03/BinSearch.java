package chap03;

import java.util.Scanner;

public class BinSearch {

	// 요솟수가 n인 배열a에서 key와 같은 요소를 이진 검색합니다.
	static int binSearch(int[] x, int num, int key) {
		int pl = 0;
		int pr = num -1;
		
		do {
			int pc = (pl + pr) / 2;
			if(x[pc] == key) {
				return pc;
			} else if (x[pc] < key) {
				pl = pc + 1;
			} else {
				pr = pc -1;
			}
		}while(pl <= pr);
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		System.out.println("x["+ 0 +"] :");
		x[0] = sc.nextInt();
		
		for(int i = 1; i<num; i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i] = sc.nextInt();
			} while(x[i] < x[i-1]);
		}
		
		System.out.println("검색할 값 : ");
		int key = sc.nextInt();
		int result = binSearch(x, num, key);
		if(result < 0) {
			System.out.println("검색한 값이 없습니다.");
		}else {
			System.out.println(key +"값은 x[" + result + "]");
		}
	}
}
