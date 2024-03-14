
/**
 * Write a description of class FullGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullGame
{
    WordGuessingGame wordGuessingGame;
    InputReader reader;

    public FullGame()
    {
        wordGuessingGame = new WordGuessingGame();
        reader = new InputReader();
    }

    public void play(){
        char choice = 's';
        while(choice == 's' || choice == 'S'){
            wordGuessingGame.reset();
            wordGuessingGame.play();
            choice = reader.getChar("Quer jogar de novo? (s/S para continurar, qualquer outra letra para sair): ");
        }
        System.out.println("Obrigado por jogar!");
    }
}
