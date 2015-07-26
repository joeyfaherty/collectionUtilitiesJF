package com.home;
import java.util.ArrayList;
import java.util.List;


public class ListBuilder {
	
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

}
