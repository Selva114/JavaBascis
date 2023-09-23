package PcKY;
import java.util.*;
public class ConsoleBasedApplication {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<Long,String>lhm=new LinkedHashMap<Long,String>();
		long l=0;
		String s="";
		while(l!=-1)
		{
			System.out.println("Enter your Mobie Number");
			l=sc.nextLong();
			sc.nextLine();//to push scanning to next liness
			
			
			System.out.println("Enter your Name");
			s=sc.nextLine();
			lhm.put(l, s);
		}
		System.out.println(lhm);

	}

}
