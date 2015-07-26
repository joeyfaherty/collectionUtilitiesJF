package com.home;

import java.util.ArrayList;
import java.util.List;


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
	
}
