package com.home;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        
        //print all file names in a directory/sub-directories
        DirectoryIterator directoryIterator = new DirectoryIterator();
		File[] files = new File("/Users/joeyfaherty/Desktop/").listFiles();
		System.out.println(directoryIterator.showFiles(files));
		
		//print pathnames of all directories/files from a specified root
		Path root = Paths.get("/Users/joeyfaherty/Desktop/");
		System.out.println(directoryIterator.listDirectoryTree(root));
	}

}
