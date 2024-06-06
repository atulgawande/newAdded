package New;

import java.util.HashMap;
import java.util.Set;

public class Goodgle 
{
	public static void main(String[] args) throws InterruptedException 
	{
//		int orgNum=123456;
//		String org = Integer.toString(orgNum);
//		String rev = "";
//		for(int i=org.length()-1;i>=0; i--)
//		{ rev=rev+org.charAt(i);
//		
//			
//		}
//		int revInt = Integer.parseInt(rev);
//		System.out.println(revInt);
//		
//		int org=123456;
//		int rev=0;
//		for(int i=org; i>0; i=i/10)
//		{
//			int rem = i%10;
//			
//			rev = rev*10 + rem;
//		}
////		System.out.println(rev);\
//		String s1="my name is khan";
//		String[] ar = s1.split(" ");
//				for(int i=0; i<=ar.length-1; i++)
//				{
//					String org = ar[i];
//					String rev="";
//					for(int j=org.length()-1; j>=0; j--)
//					{
//						rev=rev+org.charAt(j);
//						
//					}
//					System.out.print(rev + " ");
				//}
		
//		String org="Atul Gawande";
//		String[] ar = org.split(" ");
//		for(int i=ar.length-1; i>=0; i--)
//		{
//			System.out.print(ar[i] + " ");
//		}
		
		String org="abcacdefa";
		HashMap<Character , Integer> mp = new HashMap<Character , Integer>();
		for(int i=0; i<=org.length()-1; i++)
		{
			char s1 = org.charAt(i);
			if(mp.containsKey(s1))
			{
				mp.put(s1, mp.get(s1)+1);
			}
			else
			{
				mp.put(s1, 1);
			}
			Set<Character> allKeys = mp.keySet();
			for(Character key : allKeys)
			{
				
				System.out.print(key + ":" + mp.get(key));
	//			if(mp.get(key)>1)
		//		{
					System.out.println(key + ":" + mp.get(key));
		//		}
			}
		}
		
		
		
		
		
		

	
		
		
		
	}

}
