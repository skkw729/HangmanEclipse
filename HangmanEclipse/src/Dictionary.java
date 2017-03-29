import java.util.*;
import java.io.*;
/**
 * Write a description of class Hangman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dictionary
{
    // instance variables - replace the example below with your own
    Scanner textFile;
    ArrayList<String> words;
    /**
     * Constructor for objects of class Hangman
     */
    public Dictionary() throws FileNotFoundException
    {
        textFile = new Scanner(new FileReader("src/words.txt"));
        words = new ArrayList<>();
    }

    public ArrayList<String> getWords() 
    {
        // put your code here
        ArrayList<String> newWords = new ArrayList<>();
        while(textFile.hasNext())
        {
            words.add(textFile.nextLine());
        }
        for(String word : words)
        {
            if(!word.contains("'")&&!word.contains("\"")&&!word.contains("/"))
            {
                newWords.add(word);
            }
        }
        words = newWords;
        return newWords;
    }
    
    public ArrayList<String> getWords(String s)
    {
        ArrayList<String> answer = new ArrayList<>();
        for(String word : words)
        {
            if(word.contains(s))
            {
                answer.add(word);
            }
        }
        return answer;
    }
}
