package chap01;
import java.util.Scanner;
public class SumFor_Q10_dowhilever {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		do {
			System.out.print("a의 값 : "); a = sc.nextInt();
			System.out.print("b의 값 : "); b = sc.nextInt();
			
			System.out.println("a보다 큰 값을 입력하시오.");
		}while(b<a);
		
		System.out.println("b-a : " + (b-a));
	}

}
