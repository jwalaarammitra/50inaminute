import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        // greeting
        System.out.println("Welcome to 50 in a minute, the game where " +
                "you will be asked to accurately complete 50 math questions " +
                "in one minute.");
        System.out.println();

        // level selection and begin game
        System.out.println("There are 3 levels: easy, medium, and hard. " +
                "(Easy: addition, Medium: addition, subtraction, Hard: addition, " +
                "subtraction, square roots)");

        System.out.println("Type E for easy, M for medium, and H for hard. Then " +
                "press enter when you are ready and the game will begin right away.");

        // read user input
        boolean validInput = false;

        while (!validInput) {
            Scanner readObj = new Scanner(System.in);
            String level = readObj.nextLine();
            System.out.println(level);
            System.out.println();

            // if input is not valid
            if (level.compareTo("E") == 0 && level.compareTo("M") == 0
                    && level.compareTo("H") == 0 && level.compareTo("e") == 0
                    && level.compareTo("m") == 0 && level.compareTo("h") == 0) {
                System.out.println("Try again! Your input is invalid.");
                System.out.println();
            }
            else {
                System.out.println("valid");
                validInput = true;
            }
        }

        // game type by level
    }
}
