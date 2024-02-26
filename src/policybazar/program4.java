package policybazar;

public class program4 {
	public static void main(String[] args) {
		
		String str="Rahul Shubham Amol Suraj Ram Saurabh Ujwal";
		
		String [] amol=str.split(" ");
		
		for(String ammo : amol)
		{
			String a=" ";
			for(int i=ammo.length()-1;i>=0;i--)
			{
				a=a+ammo.charAt(i);
				
			}
			System.out.print(a);
		}
		
		
		
	}

}
