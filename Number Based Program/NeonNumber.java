public class NeonNumber {
	public static boolean isNeonNumber(int n) {
	    int sqr=n*n;int sum=0;
	    while(sqr>0) {
	    	int lastdigit= sqr%10;
	    	sum=sum+lastdigit;
	    	sqr=sqr/10;
	    }
	    if(sum==n) {
	    	return true;
	    	
	    }else {
	    	return false;
	    }
		
	}

	
	
	public static void main(String args[]) {
		System.out.println(isNeonNumber(9));
	}
}
