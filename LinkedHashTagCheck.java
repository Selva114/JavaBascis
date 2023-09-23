package PcKY;
import java.util.LinkedHashSet;
public class LinkedHashTagCheck {

	public static void main(String[] args) {
	
		  
		  LinkedHashSet ll=new LinkedHashSet();// ll ---> is a object which we created .meaning is linked lists 
		  
		  ll.add(891);
		  ll.add(25);
		  ll.add(3453);
		  ll.add(784);
		  ll.add(15);
		  ll.add(26);
		  
		  System.out.println(ll);
		  
		  ll.remove(26);
		  
		  ll.remove(6);// It wont give any error
		  
		  System.out.println(ll);
		  
		  System.out.println(ll.size());
		 }

		
}
