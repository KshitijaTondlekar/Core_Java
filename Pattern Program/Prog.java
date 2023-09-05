package com.jsp.patterns;

public class Prog {
	public static void main(String args[]) {
	int n=5;
	for (int i=5;i>=1;i--) {
		for(int s=1;s<=i;s++) {
			System.out.print(" ");
		}
			for(int j=0;j<=n-i;j++) {
				System.out.print("*");
				
				
			}
			System.out.println();
			}
		}
}



