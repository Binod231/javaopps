import java.util.Random;
import java.util.Scanner;

class Game{
  public   int number;
   public int userInput;
    public int noOfGuess=0;
    public void setNoOfGuess(int noOfGuess){
        this.noOfGuess=noOfGuess;

    }
    public int getNoOfGuess(){
        return noOfGuess;
    }
     Game(){
        Random random=new Random();
        this.number=random.nextInt(10);
    }
    void Takinguserinput() {
        System.out.println("Guess the number from 0-10: ");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
    }

    boolean isCorrectNumber(){

        noOfGuess++;

        if (userInput==number)
        {
            System.out.printf("you guess right number %d in %d guess... ",number,noOfGuess);
            return true;
        }
        else if (userInput<number)
        {
            System.out.println("Too Low...");
        }
      else if (userInput>number)
        {
            System.out.println("Too High...");

        }
        return false;
    }


}

public class guessGame {
    public static void main(String[] args) {
        boolean b=false;
            Game g = new Game();
        while (!b) {
            g.Takinguserinput();
            b = g.isCorrectNumber();
        }

}}
