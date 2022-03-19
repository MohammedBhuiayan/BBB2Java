package com.FirstJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {
		
		ArrayList<String> lst = new ArrayList<String>();
		lst.add("Milk");
		lst.add("Apple");
		lst.add("Rice");
		lst.add("Banana");
		lst.add(null);		
		lst.add("Grapes");
		lst.add(null);
		lst.add("Rice");
		System.out.println(lst);
		System.out.println(lst.size());
//		System.out.println(lst.get(3));
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Milk");
		ll.add("Apple");
		ll.add("Rice");
		ll.add("Banana");
		ll.add(null);		
		ll.add("Grapes");
		ll.add(null);
		ll.add("Rice");		
		System.out.println(ll);
//		System.out.println(ll.get(4));
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Milk");
		hs.add("Apple");
		hs.add("Rice");
		hs.add("Banana");
		hs.add(null);		
		hs.add("Grapes");
		hs.add(null);
		hs.add("Rice");
		System.out.println(hs);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Milk");
		lhs.add("Apple");
		lhs.add("Rice");
		lhs.add("Banana");
		lhs.add(null);		
		lhs.add("Grapes");
		lhs.add(null);
		lhs.add("Rice");
		System.out.println(lhs);
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Milk");
		ts.add("Apple");
		ts.add("Rice");
		ts.add("Banana");	
		ts.add("Grapes");
		ts.add("Rice");
		System.out.println(ts);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Milk", 3);
		map.put("Apple", 2);
		map.put("Rice", 14);
		map.put("Banana", 2);
		map.put(null, 80);		
		map.put("Grapes", 5);
		map.put("Rice", 10);	
		System.out.println(map);
		System.out.println(map.get("Rice"));
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Milk", 3);
		tm.put("Apple", 2);
		tm.put("Rice", 14);
		tm.put("Banana", 2);
//		tm.put(null, 80);	
		tm.put("test", null);
		tm.put("Grapes", 5);
		tm.put("Rice", 10);
		System.out.println(tm);
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		ht.put("Milk", 3);
		ht.put("Apple", 2);
		ht.put("Rice", 14);
		ht.put("Banana", 2);
//		ht.put(null, 80);	
//		ht.put("test", null);
		ht.put("Grapes", 5);
		ht.put("Rice", 10);
		System.out.println(ht);
		System.out.println(ht.get("Rice"));
	}

}
