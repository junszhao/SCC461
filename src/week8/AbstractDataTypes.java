package week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class AbstractDataTypes {

	public static void main(String[] args) {
		
		AbstractDataTypes adt = new AbstractDataTypes();
//		adt.generateSets();
//		adt.generateStacks();
//		adt.generateMaps();
	}
	
	public void generateLists() {
		
		// create an ArrayList that takes objects of type String
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// add in some data
		
		
	}
	
	public void generateSets() {
		// create a HashSet
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		// create a TreeSet
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		// add in some data to the hashset
		hashSet.add(3);
		hashSet.add(1);
		hashSet.add(4);
		hashSet.add(2);
		
		hashSet.addAll(treeSet);
		
		hashSet.remove(3);
		
		hashSet.clear();
				
		// output the order of each set
		for (Integer value : hashSet) {
			System.out.println(value);
		}
		
		treeSet.add(3);
		treeSet.add(1);
		treeSet.add(4);
		treeSet.add(2);
		System.out.println("\nOrder of HashSet Elements");
		for (Integer value : treeSet) {
			System.out.println(value);
		}		
		
		
	}
	
	public void generateStacks() {
		
		Stack<String> stack = new Stack<String>();			
		
	}
	
	public void generateMaps() {
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		hashMap.put("Stu", 1);
		hashMap.put("Jun", 6);
		hashMap.put("Matthew", 6);
		
		for (String key : hashMap.keySet()) {
			int value = hashMap.get(key);
			System.out.println(value);
		}
		
		int value = hashMap.get("stu");
		
		int size = hashMap.size();
		
		hashMap.remove("stu");
		
		TreeMap<Integer,String> treeMap = new TreeMap<Integer,String>();
		
	}
	
}
