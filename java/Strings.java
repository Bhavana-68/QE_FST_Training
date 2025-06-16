package activities;
import java.util.Scanner;

public class Strings {

	public static void separateCharacters(String input) {
		StringBuilder vowels = new StringBuilder();
		StringBuilder consonants = new StringBuilder();
		StringBuilder punctuations = new StringBuilder();

		String vowelSet = "AEIOUaeiou";
		String punctuationSet = ".,!?;:'\"()-";

		for (char ch : input.toCharArray()) 
		{
			if (Character.isLetter(ch)) 
			{
				if (vowelSet.indexOf(ch) != -1) 
				{
					vowels.append(ch);
				} else 
				{
					consonants.append(ch);
				}
			} else if (punctuationSet.indexOf(ch) != -1)
			{
				punctuations.append(ch);
			}
		}

		// Output the separated strings
		System.out.println("Vowels: " + vowels.toString());
		System.out.println("Consonants: " + consonants.toString());
		System.out.println("Punctuations: " + punctuations.toString());
	}

	public static void main(String[] args) 
	{
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        separateCharacters(input);
	  
	  
	}
}


