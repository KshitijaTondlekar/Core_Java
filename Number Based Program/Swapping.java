public class Swapping {
public static void main (String args[]) {
	//Without third variable
	//int a=10; int b=20;
       //a =a+b;
       //b= a-b;
       //a =a-b;
	
	
    //With third variable
       int a=10; int b=20; int temp=a;
       a = b;
       b = temp;
       
       System.out.println(a);
       System.out.println(b);
}
}
