package com.home;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class ListFlattener {
	
	/**
	 * flattens a list of objects to a single list.  
	 * Recursively iterates through any nested lists. 
	 * @param deepList
	 * @return a flattened list
	 */
	public List<Object> flattenList(List<Object> deepList) {
        List<Object> newList = new ArrayList<Object>();
        for (Object element : deepList) {
        		//if its a list, pass this list again to flattenList() to be flattened.
                if (element instanceof List) {
                	newList.addAll(flattenList((List<Object>) element));
                //its not a list, so we add it to our return list
                } else {
                	newList.add(element);
                }
        }
        return newList;
    }
	
	public List<Object> flattenListUsingStreams() {
		return null;
	}
	
	public static void main(String [] args) {
		Stream<List<Integer>> integerListStream = Stream.of(
				  Arrays.asList(1, 2), 
				  Arrays.asList(3, 4), 
				  Arrays.asList(5)
				);

				Stream<Integer> integerStream = integerListStream .flatMap((integerList) -> integerList.stream());
				integerStream.forEach(System.out::println);
	}
	
}
