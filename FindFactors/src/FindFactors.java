import java.util.Scanner;

public class FindFactors {
	static void findFactors(int num) {
		System.out.print("The factors of " + num + " are: ");
		for(int i = 1;i <= num; ++i) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int number;
		
		System.out.println("Enter an integer: ");
		number = in.nextInt();
		
		findFactors(number);
		
		in.close();
	}
}
