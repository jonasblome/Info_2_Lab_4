import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class TextParser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Map<Character, Integer> parseFile(File selectedFile) {
		
		try {
			Scanner scanner = new Scanner(selectedFile);
			//Pattern pattern = Pattern.compile("[A-Za-z0-9_]");
			char nextChar;
			String nextWord;
			Map<Character, Integer> map = new HashMap<>();
			
			
			while(scanner.hasNext()) {
				nextWord = scanner.next().toLowerCase();
				for(int i = 0; i < nextWord.length(); i++) {
					nextChar = nextWord.charAt(i);
					int count = map.containsKey(nextChar) ? map.get(nextChar) : 0;
					map.put(nextChar, count+1);
				}
			}
			
			
			
			//System.out.println(next);
			scanner.close();
			return map;
		}
		catch (IOException e) {
			
			System.out.println("Error.");
		}
		
		
		return null;
	}

}
