package chap01;
import java.util.Scanner;

//Sum between A, B
public class SumFor_Q9 {
	
	static int mine(int a, int b) {
		int sum = 0;
		
		if(a > b) {
			for(int i=b; i<=a; i++) {
				sum = sum + i;
			}
		}else {
			for(int i=a; i<=b; i++) {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	static int book(int a, int b) {
		int min; // a, b의 작은 쪽의 값
		int max; // a, b의 큰 쪽의 값

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		int sum = 0; // 합
		for (int i = min; i <= max; i++)
			sum += i;
		return sum;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a : "); int a = sc.nextInt();
		System.out.print("정수 b : "); int b = sc.nextInt();
		
		System.out.println("sum(mine) : " +mine(a, b));
		System.out.println("sum(book) : " +book(a, b));
	}

}

/*
 * for문을 종료한 다음에도 변수를 사용하려면 for문바깥쪽에서 변수를 선언
 * 다른 for문에서 같은 이름 변수를 사용하려면 각각 변수를 선언
 */
