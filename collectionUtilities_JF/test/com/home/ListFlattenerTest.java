package com.home;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ListFlattenerTest {

	@Test
	public void testFlattenList() {
		
		List<Object> mockResult = new ArrayList<Object>();
		mockResult.add(1);
		mockResult.add(2);
		mockResult.add(3);
		mockResult.add(4);
		mockResult.add(5);
		mockResult.add(6);
		mockResult.add(7);
		mockResult.add(8);
		mockResult.add(9);
		mockResult.add(10);
		
		ListFlattener listFlattener = new ListFlattener();
		ListBuilder listBuilder = new ListBuilder();
		Assert.assertEquals(mockResult, listFlattener.flattenList(listBuilder.generateDeepList()));
	}

}
