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
			Pattern pattern = Pattern.compile("\\w");
			char nextChar;
			
			
			if(scanner.hasNext(pattern)) {
				nextChar = scanner.next(pattern).charAt(0);
			} else {
				System.out.println("Pattern does not exist");
				return null;
			}
			
			
			Map<Character, Integer> map = new HashMap<>();
			
			System.out.println(nextChar);
			scanner.close();
			return map;
		}
		catch (IOException e) {
			
			System.out.println("Error.");
		}
		
		
		return null;
	}

}
