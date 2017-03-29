import java.util.*;
import java.io.*;
/**
 * Write a description of class Hangman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hangman
{
    Scanner scanner;
    Random random;
    private Dictionary dictionary;
    private ArrayList<String> wordGuess;
    private ArrayList<String> wordAnswer;
    private int wrong;
    private boolean finished;
    private HangmanPrint hangmanPrint;
    /**
     * Constructor for objects of class Hangman
     */
    public Hangman() throws FileNotFoundException
    {
        scanner = new Scanner(System.in);
        random = new Random();
        dictionary = new Dictionary();
        wordGuess = new ArrayList<>();
        wordAnswer = new ArrayList<>();
        hangmanPrint = new HangmanPrint();
        wrong = 0;
        finished = false;
    }
    
    public boolean getFinished()
    {
        return finished;
    }
    
    public ArrayList<String> getWordAnswer()
    {
        return wordAnswer;
    }
    
    public ArrayList<String> getWordGuess()
    {
        return wordGuess;
    }
    
    /**
     * Selects a random word from the dictionary and stores it in an arraylist
     */
    public String randomWord()
    {
        int randomNumber = (int)(Math.random()*dictionary.getWords().size());
        String word = dictionary.getWords().get(randomNumber);
        addWord(word);
        printUnderscores();
        return word;
    }
    
    /**
     * print underscores equal to the length of chosen word
     */
    public void printUnderscores()
    {
        for(int i=0;i<wordGuess.size();i++)
        {
            System.out.print(wordGuess.get(i)+" ");
        }
    }
    
    /**
     * add chosen word to arraylist
     */
    public void addWord(String word)
    {
        wordGuess.clear();
        wordAnswer.clear();
        wrong =0;
        finished=false;
        for(int i=0; i<word.length();i++)
        {
            wordAnswer.add(word.substring(i,i+1));
            wordGuess.add("_");
        }
    }
    
    /**
     * Replace underscores with a correctly guessed letter
     */
    public void checkGuess(String s)
    {
        if(wordGuess.contains("_"))
        {
            if(wordAnswer.contains(s))
            {
                System.out.println(s + " is in the word!");
                hangmanPrint.printLife(6-wrong);
                for(int i=0; i<wordAnswer.size();i++)
                {
                    if(wordAnswer.get(i).equals(s))
                    {
                        wordGuess.remove(i);
                        wordGuess.add(i,s);
                    }
                }
                printUnderscores();
                if(!wordGuess.contains("_"))
                {
                    finished = true;
                    System.out.println("");
                    System.out.println("You correctly guessed the whole word");
                }
            }
            else
            {
                System.out.println(s + " is not in the word");
                wrong++;
                hangmanPrint.printLife(6-wrong);
                printUnderscores();
            }
        }
        else
        {
            System.out.println("You correctly guessed the word");
        }
    }
    public int checkWrong()
    {
        return wrong;
    }
}
