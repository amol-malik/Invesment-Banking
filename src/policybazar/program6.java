
package policybazar;

public class program6 {
	public static void main(String[] args) {
		
//		String str="amol prakash malik sarika yogini ravina";
//		String[] amol = str.split(" ");
//		
//		for(String ammo : amol)
//		{
//		String rev="";
//		for(int i=ammo.length()-1;i>=0;i--)
//		{
//			rev=rev+ammo.charAt(i);
//		}
//		System.out.print(rev+" ");
//		}

		 String str="amol vaibhav shivani khushi ketki";
		    String[] amol=str.split(" ");
		    for(String ammo : amol )
		    {
		        String rev="";
		        for(int i=ammo.length()-1;i>=0;i--)
		        {
		            rev=rev+ammo.charAt(i);
		        }
		        System.out.print(rev+" ");
		    }
	}

}
