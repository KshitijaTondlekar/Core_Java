public class ArmstrongNumber {
	public static String isArmstrong(int n) {
		int count=0;int z=n;int sum=0;
		//count no of digit
		while(z>0) {
			z=z/10;
			count++;
		}
		z=n;
		while(z>0) {
			int lastdigit=z%10;
			int prod =1;
			for(int i=1;i<=count;i++) {
				prod=prod*lastdigit;
			}
			sum=sum+prod;
			z=z/10;
		}
		if(sum==n) {
			return"It is Armstrong";
		}else {
			return"It is not Armstrong";
		}
	}
	
	public static void main(String args[]) {
		System.out.println(isArmstrong(371));
	}

}
