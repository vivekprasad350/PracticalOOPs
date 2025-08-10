package lab1;

import java.util.Scanner;

public class billing {
	public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter base bill amount: ");
	        double baseBill = sc.nextDouble();

	        System.out.print("Enter GST percentage: ");
	        double gstPercent = sc.nextDouble();

	        System.out.print("Enter maintenance charges: ");
	        double maintenance = sc.nextDouble();

	        double gstAmount = (baseBill * gstPercent) / 100;
	        double subtotal = baseBill + gstAmount + maintenance;

	        double discountPercent = (subtotal > 1000) ? 10 : 5;
	        double discountAmount = (subtotal * discountPercent) / 100;

	        double totalBill = subtotal - discountAmount;

	        System.out.println("\n---- Bill Details ----");
	        System.out.println("Base Amount: Rs. " + baseBill);
	        System.out.println("GST (" + gstPercent + "%): Rs. " + gstAmount);
	        System.out.println("Maintenance Charges: Rs. " + maintenance);
	        System.out.println("Subtotal: Rs. " + subtotal);
	        System.out.println("Discount (" + discountPercent + "%): Rs. " + discountAmount);
	        System.out.println("Total Bill: Rs. " + totalBill);

	        sc.close();
	    }

}
