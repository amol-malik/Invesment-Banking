package policybazar;

public class Program01 {
	public static void main(String[] args) {

		int num=370;
		int rem = 0,sum=0;
		int num1 = num;
		

		while(num1>0) 
		{
		num=num1%10;
		sum=sum+rem*rem*rem;
		num1=num1/10;
		}
		
		if(sum==num)
		{
			System.out.println("is amstrong num");
		}
		else
		{
			System.out.println("not a amstrong number");
		}
		
		
	}
	

}
