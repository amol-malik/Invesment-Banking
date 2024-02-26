package policybazar;

import org.apache.poi.hslf.record.TextCharsAtom;

public class nikhil {

	public static void main(String[] args) throws InterruptedException {
		
		String str= "amar akbar anthoney";
//		String rev=" ";
//	System.out.println(str.length());
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);


		int size =str.length();
		for (int i = size-1; i>=0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		
	}

}
