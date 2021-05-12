import java.io.IOException;
import java.util.Map;
import java.io.EOFException;
import java.io.File;
import java.io.FileWriter;

public class Histogram {
	
	//private static final String OUTPUT_LOCATION 
	private static final int SCALING_FACTOR = 100;		

	public static void main(String[] args) {
	
		
		File selectedFile = new File("D:/Desktop/INFORMATIK 2/Lab04/example.txt");
		
		
			Map<Character, Integer> dict = TextParser.parseFile(selectedFile);
			System.out.println(dict.toString());
			try {
				generateHistorgram(dict);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
	
			
			
		

	}
	
	private static void generateHistorgram(Map<Character, Integer> dict) throws IOException {
		
		File histogram = new File("D:/Desktop/INFORMATIK 2/Lab04/Histogram.txt");
		FileWriter writer = new FileWriter("D:/Desktop/INFORMATIK 2/Lab04/Histogram.txt");
		
		if(histogram.createNewFile()) {
			System.out.println("New file was created!");
		} else {
			System.out.println("File already exists!");
		}
		
		for(Map.Entry<Character, Integer> character : dict.entrySet()) {
			char key = character.getKey();
			int value = character.getValue();
			writer.write("" + key + ": ");
			
			for(int i = 0; i < value; i++) {
				writer.write("*");
			}
			
			writer.write("\n");
				
		}
		
		writer.close();
		
		
	}

}
