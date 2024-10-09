import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner in = new Scanner(System.in);
        boolean done = false;
        boolean stopRoll = false;
        int dieOne = 0;
        int dieTwo = 0;
        int rollSum = 0;

        do {
            System.out.println("");

            dieOne = generator.nextInt(6) + 1;
            dieTwo = generator.nextInt(6) + 1;
            rollSum = dieOne + dieTwo;
            stopRoll = false;

            System.out.println("Die 1: " + dieOne + ", Die 2: " + dieTwo + ", Sum: " + rollSum);

            if (rollSum <= 3 || rollSum == 12)
            {
                System.out.println("You crapped out. You lose.");
            } else if (rollSum == 7 || rollSum == 11) {
                System.out.println("You got a natural. You win!");
            } else {
                System.out.println("The point is now " + rollSum + "!");
                System.out.println("");
                while (!stopRoll) {
                    System.out.println("Trying for point...");

                    dieOne = generator.nextInt(6) + 1;
                    dieTwo = generator.nextInt(6) + 1;

                    System.out.println("Die 1: " + dieOne + ", Die 2: " + dieTwo + ", Sum: " + (dieOne + dieTwo));

                    if (dieOne + dieTwo == rollSum) {
                        System.out.println("You made the point. You win!");
                        stopRoll = true;
                    } else if (dieOne + dieTwo == 7) {
                        System.out.println("You rolled a 7. You lose.");
                        stopRoll = true;
                    };
                };
            };

            System.out.println("Play again? [Y/N]");
            done = in.nextLine().equalsIgnoreCase("n");
        }while(!done);
    }
}