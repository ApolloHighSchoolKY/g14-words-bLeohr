import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Words
{
	private ArrayList<Word> wordList;

	public Words()
	{
		wordList = new ArrayList<Word>();
	}

	public Words(String s)
	{
		wordList = new ArrayList<Word>();
		setWords(s);
	}

	public void setWords(String s)
	{
		//Create a Scanner for the list of words in the string "s"
		Scanner choppa = new Scanner(s);

		//Continue to loop while there are more words to read
		while(choppa.hasNext())
		{
			wordList.add(new Word (choppa.next()));
		}
			//Add objects of the type Word to our ArrayList "wordList"


	}

	public int countWordsWithXChars(int size)
	{
		int count=0;

		//for every Word in the ArrayList "wordList"
		for(Word goldilocks: wordList)
		{
			if(goldilocks.getLength()==size)
			count++;
		}

			//if the length of the "theWord" is the same as the parameter "size"

		return count;
	}

	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
		int vowelCount = 0;

		//for each Word in the ArrayList "words" loop
		for(int i=wordList.size()-1; i>=0; i--)
		{
			if(wordList.get(i).getLength()==size)
			{
			vowelCount+=wordList.get(i).getNumVowels();
			wordList.remove(wordList.get(i));
			}

		}

			//if the Word has "size" characters


		return vowelCount;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;

		//for every Word in the ArrayList "words"
		for(Word gotVowels: wordList)
		{
			if(gotVowels.getNumVowels()>0)
			count++;
		}

			//if the number of vowels in "theWord" is the same as the parameter "numVowels"


		return count;
	}

	public String toString()
	{
	   return "" + wordList;
	}
}