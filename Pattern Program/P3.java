package com.jsp.patterns;

public class P3 {
	public static void main(String[] args) {
	int n= 5;
	int k = 1;
	for(int i = n; i>=1; i--) {
		for(int j=n;j>=k;j--) {
			//for(int j=n;j>=n-i+1;j--) {
			System.out.print(j);
		}
		k++;
		System.out.println();
	}
}

}
