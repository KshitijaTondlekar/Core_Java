package com.jsp.patterns;

public class Prog6 {

	public static void main(String[] args) {
		int n=5;
		for (int i=1;i<=n;i++) {
				for(int j=n;j>=i;j--) {
					System.out.print((char)(96+j));
					
					
				}
				System.out.println();
	}

}
}
