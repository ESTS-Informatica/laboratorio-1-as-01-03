
/**
 * Write a description of class WordGuessingGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordGuessingGame
{
    private String hiddenWord;
    private String guessedWord;
    private int numberOfTries;
    public WordGuessingGame()
    {
        this.hiddenWord = "abc";
        this.guessedWord = "___";
        this.numberOfTries = 0;
    }

    public String getHiddenWord(){
        return hiddenWord;
    }

    public String guessedWord(){
        return guessedWord;
    }

    public int numberOfTries(){
        return numberOfTries;
    }

    public void showGuessedWord(){
        System.out.println(guessedWord);
    }
}
