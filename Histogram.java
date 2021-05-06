import java.io.IOException;
import java.util.Map;
import java.io.EOFException;
import java.io.File;

public class Histogram {
	
	//private static final String OUTPUT_LOCATION 
	private static final int SCALING_FACTOR = 100;		

	public static void main(String[] args) {
	
		
		File selectedFile = new File("D:/Desktop/INFORMATIK 2/Lab04/Histogram.txt");
		
		
			Map<Character, Integer> dict = TextParser.parseFile(selectedFile);
			//generateHistogram(dict, true);
		
	
			
			
		

	}
	
	private static void generateHistorgram(Map<Character, Integer> dict, boolean addSeparator) throws IOException {
		
	}

}
