package PcKY;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String args[])
		{
LinkedHashMap<Character,Integer> lhm=new LinkedHashMap<Character,Integer>();

		String s = "java is a programming language";
char c[]=s.toCharArray();
		for(int i=0;i<c.length;i=i+1)
		{
			int counter=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]=' ';
					counter=counter+1;
				}
			}
			if(c[i]!=' ')
				
				lhm.put(c[i],counter);
		}
		System.out.println(lhm);
				}
}



/*output

{j=1, a=6, v=1, i=2, s=1, p=1, r=2, o=1, g=4, m=2, n=2, l=1, u=1, e=1}

*/