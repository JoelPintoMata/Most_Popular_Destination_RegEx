import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {

	public static void main(String[] argh) {
		Scanner scanner = new Scanner(System.in);
		int numberOfDestinations = scanner.nextInt();
		solution(numberOfDestinations, scanner);
	}
	
	private static void solution(int count, Scanner in) {
		String destination;
		String input = null;
		List<String> destinationsList = new LinkedList<String>();
		Pattern pattern;
		Matcher matcher;
		for (int i = 0; i < count; i++) {
			destination = in.next();
			input = input +";"+destination;
			destinationsList.add(destination);
		}
		int numberOfOccurrences = 0;
		int maxOccurrences = 0;
		String maxCity = null;
		for (String str:destinationsList) {
			pattern = Pattern.compile(str);
	        matcher = pattern.matcher(input);
	        numberOfOccurrences = 0;
	        while(matcher.find())
	        	numberOfOccurrences++;
	        if(numberOfOccurrences > maxOccurrences){
	        	maxOccurrences = numberOfOccurrences;
	        	maxCity = str;
	        }
		}
		System.out.println(maxCity);
	}
}