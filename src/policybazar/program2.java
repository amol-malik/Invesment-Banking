package policybazar;



public class program2 {

	public static void main(String[] args) {
	String str="amol prakash malik vaibhav shivani rekha" ;

	String[] amol = str.split(" ");
	String ram="";
	for(String q:amol)
	{
		
		String rev="";
		for(int i=q.length()-1;i>=0;i--)
		{
			rev=rev+q.charAt(i);
		}
		System.out.print(rev+" ");
		//ram=ram+rev+" ";
	}
	
	//System.out.println(ram);
}
}

