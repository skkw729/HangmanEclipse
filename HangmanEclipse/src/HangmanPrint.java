
/**
 * Write a description of class HangmanPrint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HangmanPrint
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class HangmanPrint
     */
    public HangmanPrint()
    {
        
    }

    /**
     * prints hangman
     */
    public void printLife(int lives)
    {
        if(lives == 0)
        {
            System.out.println("");
            System.out.println(" ___");
            System.out.println("|   |");
            System.out.println("|   O");
            System.out.println("|  /|\\");
            System.out.println("|   |");
            System.out.println("|  / \\");
            System.out.println("|");
            System.out.println("|______");
        }
        else if(lives == 1)
        {
            System.out.println("");
            System.out.println(" ___");
            System.out.println("|   |");
            System.out.println("|   O");
            System.out.println("|  /|\\");
            System.out.println("|   |");
            System.out.println("|    \\");
            System.out.println("|");
            System.out.println("|______");
        }
        else if(lives ==2)
        {
            System.out.println("");
            System.out.println(" ___");
            System.out.println("|   |");
            System.out.println("|   O");
            System.out.println("|  /|\\");
            System.out.println("|   |");
            System.out.println("|     ");
            System.out.println("|");
            System.out.println("|______");
        }
        else if(lives == 3)
        {
            System.out.println("");
            System.out.println(" ___");
            System.out.println("|   |");
            System.out.println("|   O");
            System.out.println("|  /|");
            System.out.println("|   |");
            System.out.println("|   ");
            System.out.println("|");
            System.out.println("|______");
        }
        else if(lives ==4)
        {
            System.out.println("");
            System.out.println(" ___");
            System.out.println("|   |");
            System.out.println("|   O");
            System.out.println("|   | ");
            System.out.println("|   |");
            System.out.println("|  ");
            System.out.println("|");
            System.out.println("|______");
        }
        else if(lives ==5)
        {
            System.out.println("");
            System.out.println(" ___");
            System.out.println("|   |");
            System.out.println("|   O");
            System.out.println("|  ");
            System.out.println("|   ");
            System.out.println("|   ");
            System.out.println("|");
            System.out.println("|______");
        }
        else if(lives ==6)
        {
            System.out.println("");
            System.out.println(" ___");
            System.out.println("|   |");
            System.out.println("|   ");
            System.out.println("|  ");
            System.out.println("|   ");
            System.out.println("|  ");
            System.out.println("|");
            System.out.println("|______");
        }
    }
}
