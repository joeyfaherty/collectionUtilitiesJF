package com.home;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryIterator {
	/**
	 * listFiles() from the java File API.
	 * It returns an array of all the files in a directory
	 * @param args
	 */
	public static void main(String [] args) {
		File[] files = new File("/Users/joeyfaherty/Desktop/LearningFinaCutProXorMavericks").listFiles();
		System.out.println(showFiles(files));;
	}

	private static List<String> showFiles(File[] files) {
		List<String> returnList = new ArrayList<>();
		for (File element : files) {
			//if its a directory, pass it to showFiles() again
			if (element.isDirectory()) {
				returnList.addAll(showFiles(element.listFiles()));
			}
			//it's a file, so just add it to the return list.
			else {
				returnList.add(element.getName());
			}
		}
		return returnList;
	}

}
