package lab2;
import java.util.Scanner;
public class FirstOne {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Character at index 2: " + input.charAt(2));
        System.out.println("Length of string: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());
        System.out.println("Substring (2 to 5): " + input.substring(2, 5));
        System.out.println("Contains 'java': " + input.contains("java"));

        sc.close();
		
	}
}
