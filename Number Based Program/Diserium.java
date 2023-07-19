public class DiseriumNumber {
	public static boolean isDiserium(int n) {
		int z=n;int count=0;int sum=0;
		//digit count
		while(z>0) {
			z=z/10;
			count++;
		}z=n;
		while(z>0) {
			int lastdigit =z%10;
			int prod =1;
			for(int i=1;i<=count;i++) {
				prod=prod*lastdigit;
			}
			count--;
			sum=sum+prod;
			z=z/10;
		}
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}
public static void main(String args[]) {
	System.out.println(isDiserium(175));
}
}
