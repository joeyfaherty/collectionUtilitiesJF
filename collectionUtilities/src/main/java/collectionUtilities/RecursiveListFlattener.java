package collectionUtilities;

import java.util.ArrayList;
import java.util.List;

public class RecursiveListFlattener {
	
	public static void main(String [] args) {
		RecursiveListFlattener instance = new RecursiveListFlattener();
		List<Object> deeplist = instance.generateDeepList();
		System.out.println("Deep List: " + deeplist);
		
		List<Object> flatListRecursion = instance.flattenList(deeplist);
        System.out.println("Flat list: " + flatListRecursion);
	}
	
	/**
	 * Generate List of objects in the form: [1, [2, 3], [4, [5, [6, 7], 8], 9], 10]
	 * @return 
	 */
	public List<Object> generateDeepList() {
		int position0 = 1;
		
		List<Object> position1 = new ArrayList<Object>();
		position1.add(2);
		position1.add(3);

		List<Object> nestedInner = new ArrayList<Object>();
		nestedInner.add(6);
		nestedInner.add(7);

		List<Object> nested = new ArrayList<Object>();
		nested.add(5);
		nested.add(nestedInner);
		nested.add(8);

		List<Object> position2 = new ArrayList<Object>();
		position2.add(4);
		position2.add(1, nested);
		position2.add(9);

		int position3 = 10;

		List<Object> fullList = new ArrayList<Object>();
		fullList.add(position0);
		fullList.add(position1);
		fullList.add(position2);
		fullList.add(position3);
		return fullList;
	}
	
	public List<Object> flattenList(List<Object> deepList) {
        List<Object> newList = new ArrayList<Object>();
        for (Object element : deepList) {
                if (element instanceof List) {
                	newList.addAll(flattenList((List<Object>) element));
                } else {
                	newList.add(element);
                }
        }
        return newList;
    }

}
