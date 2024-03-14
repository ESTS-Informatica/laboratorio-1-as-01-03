
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
    private InputReader reader;
    private WordGenerator wordGenerator;

    public WordGuessingGame()
    {
        this.wordGenerator = new WordGenerator();
        this.hiddenWord = wordGenerator.generateWord();
        initializeGuessedWord();
        this.numberOfTries = 0;
        this.reader = new InputReader();
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

    private void showWelcome(){
        System.out.println("Bem Vindo!");
    }

    private void initializeGuessedWord(){
        guessedWord = "";
        for(int i=0; i<hiddenWord.length(); i++){
            guessedWord += "_";
        }
    }

    private boolean guess(char letter){
        boolean found = false;
        for(int i=0; i<hiddenWord.length(); i++){
            if(hiddenWord.charAt(i) == letter && guessedWord.charAt(i) == '_'){
                guessedWord = guessedWord.substring(0, i) + letter + guessedWord.substring(i+1);
                found = true;
            }
        }
        return found;
    }

    private void showResult(){
        System.out.println("Parabéns! Acertou a palavra em " + numberOfTries + " tentativas");
    }

    public void play(){
        showWelcome();
        while(!hiddenWord.equals(guessedWord)){
            showGuessedWord();
            char letter = reader.getChar("Adivinhe uma letra: ");
            if(guess(letter)){
                System.out.println("Acertou!");
            }else{
                System.out.println("Errou... Tente de novo");
            }
            numberOfTries++;
        }
        showResult();
    }

    public void reset(){
        hiddenWord = wordGenerator.generateWord();
        initializeGuessedWord();
        numberOfTries = 0;
    }
}
