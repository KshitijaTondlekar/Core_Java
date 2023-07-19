import java.util.Scanner;
public class ReverseNumber {
	public static int isReverseNumber(int n) {
		
		int rev=0;
		while(n>0) {
			int lastdigit=n%10;
			rev=rev*10+lastdigit;
			n=n/10;
		}
		return rev;
		
	}

	
	
	
	
	public static void main(String args[]) {
		System.out.println(isReverseNumber(1134));
	}
}