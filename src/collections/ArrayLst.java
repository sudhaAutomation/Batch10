package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayLst {

	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();//
		LinkedList<Integer> list=new LinkedList<Integer>();
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		 map.put(300,"ramu");
		array.add(500);
		array.add(600);
	
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("ramu");
		array1.add("somu");
		array1.add("seetha");
	array1.add("Test");
System.out.println(array);
//array.remove(2);
System.out.println(array);//300,500
System.out.println(array1);
//array1.remove(1);
System.out.println(array1);
ArrayList<String> array2 = new ArrayList<String>();
array2.add("ramesh");
array2.add("suresh");
array2.add("mahesh");
array2.add("chakri");

System.out.println(array2);
System.out.println(array1.containsAll(array2));//
//array2.clear();
System.out.println(array2);
//System.out.println(array2.addAll(array1));
System.out.println(array2);
//System.out.println(array2.removeAll(array1));
System.out.println(array2);
System.out.println(array1.retainAll(array2));//
System.out.println(array2);
System.out.println(array1.size());
Iterator<String> iter=array2.iterator();
System.out.println(iter.next());
System.out.println(iter.next());
System.out.println(iter.next());
System.out.println(iter.next());


System.out.println(iter.hasNext());

	}

}
