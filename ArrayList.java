package webdr;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		
		al.add("s");
		al.add("i");
		al.add("v");
		al.add("o");
		al.add("m");
		
	//	System.out.println(al.get(0));
		
		System.out.print("Original contents of al: ");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object element = itr.next();
			
			System.out.println(element);
		}
	
	/* - Before java2 collections framework..legacy collections framework is used.
		- when ever we write a equalsmethod we should write hashcode method also
		- Diff btw Hashset and Treeset: Treeset is ordered collection of elements 
		  where as hashset is unordered 
		- collections framework: collection , list, set and map are interfaces. */
	}

}