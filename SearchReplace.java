package PcKY;

import java.util.ArrayList;

public class SearchReplace {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(55);
		al.add(8);
		al.add(6);
		al.add(7);
		al.add(78);
		al.add(19);
		al.add(7);
		al.add(6);
		al.add(9);
		System.out.println(al);
		int search=19;
		int replace=20;
		for(int i=1;i<al.size();i++){
			if(al.get(i)==search)
			{
				al.set(i, replace);
			}
		
			
		}
		
		System.out.println(al);
	}	
		}
		

		/*System.out.println(al);
		al.remove(6);
		System.out.println(al);

		al.remove(al.indexOf(759));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(0));
		System.out.println(al.indexOf(6));
		System.out.println(al.lastIndexOf('h'));
		System.out.println(al.set(1,100));
		System.out.println(al);*/
		
		
		
		
		
		

/*
 * output
 * 
 * [55, h, guru, 869.8, 78, 759, 7, 6, 9]
*[55, h, guru, 869.8, 78, 759, 6, 9]
[55, h, guru, 869.8, 78, 6, 9]
7
55
5
1

 */