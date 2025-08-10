package lab1;

public class swappingapples {
	public static void main(String args[]) {
		int tom, jerry;
		jerry = 5;
		tom = 3;
		System.out.println("Jerry has " + jerry + " apples");
		System.out.println("Tom has " + tom + " apples");
		int temp;
		temp = jerry;
		jerry = tom;
		tom = temp;
		System.out.println("After Swapping: ");
		System.out.println("Jerry has " + jerry + " apples");
		System.out.println("Tom has " + tom + " apples");
	}
}
