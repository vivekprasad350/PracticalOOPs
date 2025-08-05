package lab2;

public class TwoString {
	public static void main(String args[]) {
		String str1 ="HELLO";
        String str2 =new String("HELLO");

        System.out.println("Using equals(): " + str1.equals(str2)); 
        System.out.println("Using == : " + (str1 == str2));
        
        String str3 = "vivek";
        String str4 = "VIVEK";
        System.out.println(str3.equals(str4));
        System.out.println("Using == :" + (str3 == str4));
    }
}
