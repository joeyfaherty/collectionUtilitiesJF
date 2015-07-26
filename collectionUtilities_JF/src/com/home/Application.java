package com.home;

import java.util.List;

public class Application {

	public static void main(String [] args) {
		ListBuilder listBuilder = new ListBuilder();
		List<Object> deeplist = listBuilder.generateDeepList();
		System.out.println("Deep List: " + deeplist);
		
		ListFlattener listFlattener = new ListFlattener();
		List<Object> flatListRecursion = listFlattener.flattenList(deeplist);
        System.out.println("Flat list: " + flatListRecursion);
        
	}

}
