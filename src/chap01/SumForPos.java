package chap01;
import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 sum");
		
		// check if n <= 0
		do {
			System.out.println("n : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		
		for (int i=1; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum of 1~n : " + sum);
	}

}
