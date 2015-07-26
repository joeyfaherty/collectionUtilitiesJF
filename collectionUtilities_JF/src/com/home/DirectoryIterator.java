package com.home;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DirectoryIterator {

	/**
	 * listFiles() from the java File API.
	 * It returns an array of all the files in a directory
	 * @param array of directory files
	 * @return List<String> of file names
	 */
	public List<String> showFiles(File[] files) {
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
	
	/**
	 * Use Files.walk() to generate a List of Paths by walking the filesystem recursively.
	 * @param path
	 * @return a list of paths
	 */
    public List<Path> listDirectoryTree(Path path) {
    	List<Path> list = new ArrayList<Path>();
    	try {
			Files.walk(path).forEach(list::add);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return list;
    }

}
