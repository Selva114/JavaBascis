package PcKY;
import java.util.*;
public class HashMapCheck {

	public static void main(String[] args) {
	
	HashMap<String,String> hm=new HashMap<String,String>();
	//LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();Output will maintain Insertion order 
	//TreeMap<String,String> hm=new TreeMap<String,String>();output will maintain Attendence order .
	
	hm.put("java", "abc");
	hm.put("python", "skje");
	hm.put("c", "khdfih");
	hm.put("c++", "ksgi");
	hm.put("c#", "jgpogh");
	hm.put("c", "Selva");

	
	System.out.println(hm);

	}

}


/* OUTPUT

{c#=jgpogh, C++=ksgi, java=abc, c=khdfih, Python=skje}

*/