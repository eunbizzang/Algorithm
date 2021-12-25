package chap01;

public class SumFor_Q13 {

	// Plus99
	public static void main(String[] args) {
		System.out.println("----------------표--------------");
		
		System.out.print("  |");
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		System.out.println("--+-----------------------------");
		
		for(int i=1; i <=9; i++) {
			
			System.out.print(" "+i+"|");
			for(int j=1; j<= 9; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}
	}
}

/*----------------표--------------
|  1  2  3  4  5  6  7  8  9
--+-----------------------------
1|  2  3  4  5  6  7  8  9 10
2|  3  4  5  6  7  8  9 10 11
3|  4  5  6  7  8  9 10 11 12
4|  5  6  7  8  9 10 11 12 13
5|  6  7  8  9 10 11 12 13 14
6|  7  8  9 10 11 12 13 14 15
7|  8  9 10 11 12 13 14 15 16
8|  9 10 11 12 13 14 15 16 17
9| 10 11 12 13 14 15 16 17 18
*/