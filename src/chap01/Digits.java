package chap01;
import java.util.Scanner;

// 구조적 프로그래밍(Structured programming)
// 하나의 입구와 하나의 출구를 가진 구성 요소만을 계층적으로 배치하는 프로그램
public class Digits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하시오.");

		do {
			System.out.print("정수 : ");
			no = sc.nextInt();
		// 논리곱 && 논리합 ||
		// 논리연산의 경우, 왼쪽 평가 결과만으로 정확해지는 경우를 
		// 단축평가(short circuit evaluation)이라고 함.
		}while (no < 10 || no > 99);
		// 드모르간 법칙
		// !(no >= 10 $$ no<=99)
		// x && y 와 !( !x || !y)
		// x || y 와 !( !x && !y)는 같다.
		System.out.println("변수 no 의 값은 " +no + "가 되었습니다.");
	}

}
