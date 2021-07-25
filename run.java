import java.util.Random;
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
        String level = null;

        while (!validInput) {
            Scanner readObj = new Scanner(System.in);
            level = readObj.nextLine();

            // if input is not valid
            if (level.compareTo("E") != 0 && level.compareTo("M") != 0
                    && level.compareTo("H") != 0 && level.compareTo("e") != 0
                    && level.compareTo("m") != 0 && level.compareTo("h") != 0) {
                System.out.println("Try again! Your input is invalid.");
                System.out.println();
            }
            else {
                validInput = true;
            }
        }

        int count = 0;

        // game type by level
        if (level.compareTo("E") != 0 || level.compareTo("e") != 0) {
            easy(count);
        }
        if (level.compareTo("M") != 0 || level.compareTo("m") != 0) {
            medium(count);
        }
        if (level.compareTo("H") != 0 || level.compareTo("h") != 0) {
            hard(count);
        }
    }

    // helper function: manages easy level
    public static void easy(int count) {
        for (int i = 0; i < 50; i++) {
            Random rand = new Random();
            int upperbound = 15;
            int a = rand.nextInt(upperbound);
            int b = rand.nextInt(upperbound);
            int c = a + b;
            int answer = 0;

            System.out.println(a + " + " + b + " = ");
            Scanner readObj = new Scanner(System.in);
            if (readObj.hasNextInt()) {
                answer = readObj.nextInt();
            }
            else {
                System.out.println("Try again! Your input is invalid.");
                System.out.println();
            }

            if (answer == c) { count++; }
        }
    }

    // helper function: manages medium level
    public static void medium(int count) {
        for (int i = 0; i < 50; i++) {
            Random rand = new Random();
            int upperbound = 15;
            int a = rand.nextInt(upperbound);
            int b = rand.nextInt(upperbound);
            int c;

            boolean add = false;

            if (i % 2 == 0) {
                add = true;
                c = a + b;
                System.out.println(a + " + " + b + " = ");
            }
            else {
                c = a - b;
                System.out.println(a + " - " + b + " = ");
            }

            Scanner readObj = new Scanner(System.in);
            while (!readObj.hasNextInt()) {
                System.out.println("Try again! Your input is invalid.");
                if (add) {
                    System.out.println(a + " + " + b + " = ");
                }
                else {
                    System.out.println(a + " - " + b + " = ");
                }
            }
            int answer = readObj.nextInt();

            if (answer == c) { count++; }
        }
    }

    // helper function: manages hard level
    public static void hard(int count) {

    }

    // CLOSE SCANNERS!
}
