package com.home;

import java.io.File;
import java.util.List;

public class Application {

	public static void main(String [] args) {
		//generate a deep List and print
		ListBuilder listBuilder = new ListBuilder();
		List<Object> deeplist = listBuilder.generateDeepList();
		System.out.println("Deep List: " + deeplist);
		
		//flatten a deep List and print
		ListFlattener listFlattener = new ListFlattener();
		List<Object> flatListRecursion = listFlattener.flattenList(deeplist);
        System.out.println("Flat list: " + flatListRecursion);
        
        //print all files in a directory and subdirectories
        DirectoryIterator directoryIterator = new DirectoryIterator();
		File[] files = new File("/Users/joeyfaherty/Desktop/LearningFinaCutProXorMavericks").listFiles();
		System.out.println(directoryIterator.showFiles(files));;
	}

}
