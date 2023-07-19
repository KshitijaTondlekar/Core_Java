public class SumevenProductodd {

	public static void main(String[] args) {
		int n=10;int sum=0;int prod=1;
		for(int i=1;i<=n;i++)
			if(i%2==0)
			{
				sum=sum+i;	
			}else
			{
				prod=prod*i;
			}
		System.out.println("Sum Even no are :"+sum);
		System.out.println("Product Odd no are: "+prod);
	}
	
}
