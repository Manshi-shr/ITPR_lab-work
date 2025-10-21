package project1;
import java.util.Scanner; // importing Scanner class for user input
/*--- Creating a class for String Character related problems ----*/
class StringCharacterOperation
{
	/*---- Method for counting number of vowels ----*/
	public static int countVowels(String data)
	{
		int vowels = 0;
		char character;
		for(int index = 0;index< data.length();index++)
		{
			character = data.charAt(index); //fetching character at given index from string
			if(character=='a' || character == 'A' || character == 'e' || character == 'E' || character =='i' ||
			character=='I' || character=='o' || character == 'O' || character=='u' || character == 'U')
			{
				vowels++; //incrementing count of vowels
			}
		}
		return vowels;
	}
	
	/*---- Method for Counting number of uppercase characters -----*/
	public static int countUpperCaseCharacter(String data)
	{
		int upper = 0;
		char character;
		for(int index = 0;index< data.length();index++)
		{
			character = data.charAt(index); //fetching character at given index from string
			if(character >= 'A' && character <= 'Z') //verifying uppercase character
			{
				upper++;	//incrementing number of uppercase characters
			}
		}
		return upper;
	}
	
	/*---- Method for counting number of alphabets in given string ----*/
	public static int countAplhabet(String data)
	{
		int alphabet = 0;
		char character;
		for(int index = 0;index< data.length();index++)
		{
			character = data.charAt(index); //fetching character at given index from string
			if((character >= 'A' && character <= 'Z') || (character >='a' && character <='z'))
			{
				alphabet++;
			}
		}
		return alphabet;
	}
}
/*------------------------------------------------------------------------------------*/
/*---- Initial class -----*/
public class StringOperation {

	public static void main(String[] args) {
		//creating string reference
		String sentence;
		//Creating object of Scanner class
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter any Sentence : ");
		sentence = sc.nextLine();
		System.out.println("--------------------------------------------------");
		System.out.println("No. of Vowels : "+StringCharacterOperation.countVowels(sentence));
		System.out.println("No. of Uppercase characters : "+StringCharacterOperation.countUpperCaseCharacter(sentence));
		System.out.println("No. of Alphabets : "+StringCharacterOperation.countAplhabet(sentence));
	}

}
