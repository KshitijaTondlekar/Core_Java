

import java.util.Scanner;

public class CountDigit {
public int CountDigit(int n) {
	int count=0;
	while(n>0) {
		n=n/10;
		count++;
	}
	return count;
}
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no:");
	int n=sc.nextInt();
	CountDigit c=new CountDigit();
	System.out.println(c.CountDigit(n));
}
}
