package lab1;
import java.util.Scanner;
public class SquareRoot {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Enter a number");
	int n = sc.nextInt();
	
	System.out.println("\nNumber\tSquare Root");
    for (int i = 1; i <= n; i++) {
        double sqrt = Math.sqrt(i);
        System.out.println(i + "\t" + sqrt);
		
	   }
	}
}
