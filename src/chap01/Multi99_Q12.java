package chap01;
public class Multi99_Q12 {

	//    1  2  3  4  5  6  7  8  9
	// 1  1  2  3  4  5  6  7  8  9 
	// 2  2  4  6  8 10 12 14 16 18
	// 3  3  6  9 12 15 18 21 24 27 
	// 4  4  8 12 16 20 24 28 32 36
	// 	
	public static void main(String[] args) {
		System.out.println("----------곱셈표-----------");
		
		System.out.print("  |");
		for(int i=1; i<=9; i++) { 
			System.out.printf("%3d", i);
		}
		System.out.println("\n---+---------------------------");

		for(int i=1; i<=9; i++) {
			
			for(int j=1; j<=9; j++) {
				
				System.out.print(i + "|");
				System.out.printf("%3d", i*j);
			}
			System.out.println();
		}
		
		//book version
		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d |", i);
			for (int j = 1; j <= 9; j++)
				System.out.printf("%3d", i * j);
			System.out.println();
		}
	}

}
