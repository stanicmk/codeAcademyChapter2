package filesOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class TextFileToJava {
	
	public static void main(String[] args) {
		
		String filePath="resources/data.txt";
		
		HashMap<String, String> result = new HashMap<String, String>();
		
		
		BufferedReader br = null;
		
		File file = new File(filePath);
		
		try {
			br = new BufferedReader(new FileReader(file));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String line = null;
		
		try {
			while((line = br.readLine()) != null) {
				
				String[] elements = line.split("=");
				result.put(elements[0], elements[1]);
				
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Map: " + result);
	}

}
