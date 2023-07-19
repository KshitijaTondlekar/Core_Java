public class SpyNumber {
	public static boolean isSpyNumber(int n) {
		int sum=0;int prod=1;
		while(n>0) {
			int lastdigit = n%10;
			sum=sum+lastdigit;
			prod=prod*lastdigit;
			n=n/10;	
		}
		if(sum==prod) {
			return true;
		}else
		{
			return false;
		}
	}

	
	
	
	public static void main(String args[]) {
		System.out.println(isSpyNumber(1124));
	}
}
