import java.util.Scanner;

public class FactorialNumber {
	public static int factorial(int n) {
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
	}
	return fact;

}

public static void main(String args[]) {
	System.out.println(factorial(5));
	
		
		
	}
}