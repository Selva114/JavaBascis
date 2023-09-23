package PcKY;

import java.util.*;

public class ALtoAnySet {

 public static void main(String[] args) {

  ArrayList<Integer> al = new ArrayList<Integer>();
    
    al.add(9);
    al.add(7);
    al.add(45);
    al.add(9);
    al.add(55);
    al.add(7);
    al.add(7);
    System.out.println(al);
    
    LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
    
                lhs.addAll(al);
                System.out.println(lhs);
                
                HashSet<Integer> hs = new HashSet<Integer>();
    hs.addAll(al);
                System.out.println(hs);
                
                TreeSet<Integer> ts = new TreeSet<Integer>();
    ts.addAll(al);
                System.out.println(ts);
    
 
}
}
