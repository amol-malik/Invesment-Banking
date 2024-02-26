package policybazar;

public class numberPyramid {
	public static void main(String[] args) {
		
//		int a=1;
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<i;j++)
//			{
//				System.out.print(a+" ");
//				a++;
//			}
//			System.out.println();
//		}
		
//		  String str="amol vaibhav saurabh ujwal";
//		  
//		  String rev="";
//		  
//		  for(int i=str.length()-1;i>=0;i--)
//		  {
//			  rev=rev+str.charAt(i);
//			  
//		  }
//		  
//		  System.out.println(rev);
		String str="amol vaibhav saurabh ujwalrahul goma rama ghj";
		String[] amol = str.split(" ");  
		
		  for(String a : amol)
		  {
			  String rev=" ";
			  for(int i=a.length()-1;i>=0;i--)
			  {
				  rev=rev+a.charAt(i);
			  }
			  
			  System.out.print(rev+" ");
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
	}

}
