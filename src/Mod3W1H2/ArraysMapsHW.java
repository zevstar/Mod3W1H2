package Mod3W1H2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraysMapsHW {
	
	
//	private void sysout() {
//		// TODO Auto-generated method stub

//	}

	public static boolean getUp(boolean squawking, int currentHour) {
		
			if (squawking) {
				if (currentHour < 0 || currentHour > 2300) {
					return false;
				} else if (currentHour < 600 || currentHour > 2200) {
					return true;
				} else
					return false;
			}else {
				return false;
		
			}
	}
	
	
	
	
	public static void main(String[] args) {
		// copy 1 array list
		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> nums2 = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(5);
		nums.add(7);
		nums.add(6);
		nums.add(0);
		System.out.println(nums);
		nums2.addAll(nums);
		System.out.println(nums2);
		
		// extract portion	
		nums.subList(2,4).clear();
		System.out.println(nums);
		
		// swap two elements
		
		ArrayList<String> dogs = new ArrayList<>();
		dogs.add("Lab");
		dogs.add("Dachshund");
		dogs.add("Cairn");
		System.out.println(dogs);
//		dogs.add(0, "Cairn");
//		dogs.add(2, "Lab");
		Collections.swap(dogs, 1, 2);
		System.out.println(dogs);	
		
		// test an array list is empty or not
		System.out.println(dogs.isEmpty());
		
		// Write a Java program to replace the second element of an ArrayList with the specified element
		
		dogs.set(0, "Malamute");
		System.out.println(dogs);
		
		// Write a Java program to trim the capacity of an array list the current list size
		ArrayList<String> colors = new ArrayList<>(10);
		colors.add("red");
		colors.add("orange");
		colors.add("green");
		colors.add("black");
		colors.add("yellow");
		colors.add("blue");
		colors.add("indigo");
		Collections.addAll(colors, "pink", "royal", "white", "brown");
		System.out.println(colors);
		colors.trimToSize();
		
		// Write a Java program to test a hash set is empty or not.
		
		HashMap<String, String> food = new HashMap<>();
		food.put("ice cream", "hot fudge");
		food.put("hot dog", "sauerkraut");
		food.put("burger", "pickles");
		food.put("cereal", "banana");
		food.put("coffee", "cream");
		
		System.out.println(food.isEmpty());
		
		// Write a Java program to get the number of elements in a hash set
		HashSet<String> food2 = new HashSet<>();
		food2.add("ice cream");
		food2.add("hot dog");
		food2.add("burger");
		food2.add("cereal");
		food2.add("coffee");
		
		System.out.println(food.size()); // HashMap
	
		System.out.println(food2.size()); // HashSet
		
		// Write a Java program to iterate through all elements in a hash list.
		
		HashMap<Integer, String> food3 = new HashMap<>();
		food3.put(1, "ice cream");
		food3.put(2, "hot dog");
		food3.put(3, "burger");
		food3.put(4, "cereal");
		food3.put(5, "coffee");
		
		for(Map.Entry<String, String> set : food.entrySet()) {
			System.out.println(set.getKey() + " goes with " + set.getValue());
		}
//		for (String key : hashMap.keySet()) {
		   // System.out.println("Key: " + key + ", Value: " + map.get(key));
		//}
		
		// Write a Java program to convert a hash set (key-value pair) to an array.
		
		String[] arr = new String[food2.size()];
		food2.toArray(arr);
		
		for(String value : arr) {
			System.out.println(value);
		}
		
		// Write a Java program to compare two sets and retain elements that are the same on both sets.
		
		Set<String> names1 = new HashSet<String>();
		names1.add("Lane");
		names1.add("Shirelle");
		names1.add("Teo");
		names1.add("Revathy");
		names1.add("Michael");
		Set<String> names2 = new HashSet<String>();
		names2.add("Lane");
		names2.add("Shirelle");
		names2.add("Nate");
		names2.add("Gus");
		names2.add("Brandon");
		System.out.println(names1);
		System.out.println(names2);
		//System.out.println(retainAll(names1));
		
		for(String i: names1) {
			if(names2.contains(i)) {
				System.out.println(i);
			}
		}
		
		System.out.println(getUp(true, 4500));
		System.out.println(getUp(true, 500));
		System.out.println(getUp(false, -100));
		System.out.println(getUp(false, 500));
		
	
		
	}
	
	

}
