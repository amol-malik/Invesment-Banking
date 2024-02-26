package policybazar;

public class program {
	public static void main(String[] args) {
		
		int num=51;
		int count=0;
		for(int i=3;i<num;i++)
		{
			if(num%i==0)
			{	
			count ++;
			break;
			}
		}
		
		if(count==0)
		{
			System.out.println("is prime number");
		}
		else 
			System.out.println("not prime");
		
		
	}

}
