package chap01;

import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a : "); int a = sc.nextInt();
		System.out.print("b : "); int b = sc.nextInt();
		System.out.print("c : "); int c = sc.nextInt();
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		
		System.out.println("최댓값은 " + max + "입니다");
	}
}

/*
nextBoolean() : true or false
nextByte() : -128 ~ +127
nextShort() : -32768 ~ +32767
nextInt() 
nextLong() 
nextFloat()
nextDouble()
next() : 문자열(스페이스, 줄 바꿈 문자로 구분)
nextLine() : 문자열 1줄
*/