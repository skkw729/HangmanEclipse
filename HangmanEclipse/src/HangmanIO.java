import java.util.*;
import java.io.*;
/**
 * Write a description of class HangmanIO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class HangmanIO
{
    private Hangman hangman;
    private String word;
    private int wrong;
    Scanner scanner;
    boolean finished;
    private ArrayList<String> guessed;
    /**
     * Constructor for objects of class HangmanIO
     */
    public HangmanIO() throws FileNotFoundException
    {
        hangman = new Hangman();
        scanner = new Scanner(System.in);
        guessed = new ArrayList<>();
        finished = false;
        
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        HangmanIO hangmanio = new HangmanIO();
        hangmanio.mainMenu();
    }
    
    public void mainMenu()
    {
        boolean running = true;
        while(running)
        {
            System.out.println("");
            word = hangman.randomWord();
            finished = false;
            wrong=hangman.checkWrong();
            while(wrong<=6 && !finished)
            {
                System.out.println("");
                System.out.println("Guess a letter");
                String input = scanner.nextLine();
                if(input.equals("exit"))
                {
                    finished = true;
                    running = false;
                    break;
                }
                else if(input.length() == 1)
                {
                    if(!guessed.contains(input))
                    {
                        hangman.checkGuess(input);
                        guessed.add(input);
                        Collections.sort(guessed);
                        wrong = hangman.checkWrong();
                        if(wrong == 6)
                        {
                            finished =true;
                            break;
                        }
                        finished = hangman.getFinished();
                        System.out.println("");
                        if(finished)
                        {
                            break;
                        }
                        else
                        {
                            System.out.println("You have guessed "+guessed);
                            if(1 == 6-wrong)
                            {
                                System.out.println("You have 1 life left");
                            }
                            else
                            {
                                System.out.println("You have "+ (6-wrong) + " lives left");
                            }
                            System.out.println(" ");
                        }
                    }
                    else
                    {
                        System.out.println("You already guessed that!");
                    }
                }
                else
                {
                    System.out.println("Guess a single letter");
                }
            }
            if(wrong==6)
            {
                System.out.println("");
                System.out.println("You didn't manage to guess the word. You lose.");
                System.out.print("The word was ");
                for(String letter : hangman.getWordAnswer())
                {
                    System.out.print(letter);
                }
            }
            else
            {
                System.out.println(" ");
                System.out.println("Bye.");
            }
            System.out.println("");
            guessed.clear();
        }
    }
}
