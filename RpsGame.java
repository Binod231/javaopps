import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    public static void main(String[] args) {
        int count=0,count1=0;
        System.out.println("\t\tWelcome to RPS Game...\n ");
        for (int i=0;i<3;i++) {
            System.out.println("0.Paper\n1.Rock\n2.Scissor");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();
            Random random = new Random();
            int computerInput = random.nextInt(3);
            if (userInput == computerInput) {
                System.out.println("\t\tDraw the Match...\n");

            }
            else if ((userInput == 0 && computerInput == 1) || (userInput == 2 && computerInput == 0) || (userInput == 1 && computerInput == 2)) {
                System.out.println("\t\tYou Won...\n");
                count++;

            } else {
                System.out.println("\t\tComputer Won...\n");
                count1++;
            }
        }
        System.out.println("\t\t-----------------------------------");
        if (count>count1)
        {
            System.out.println("\t\tCongratulation!You won the series of match\n");
        }
        else if (count==count1)
        {
            System.out.println("\t\tDraw the series of match\n");

        }
        else {
            System.out.println("\t\tSorry!You Loss the series of match\n");
        }


    }
}
