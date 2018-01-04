package org.vashonsd;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	    SoccerBot b = new SoccerBot();
        System.out.println(b);
        SoccerBot goalie = new SoccerBot(1, "Navas");
        System.out.println(goalie);
        int guess = readInt("Please guess a number: ");
        //System.out.println(b.replyToGuess(guess));
    }

    private static String readLine(String prompt) {
        System.out.print(prompt);
        return (scan.nextLine());
    }
    //not saved
    private static int readInt(String prompt) {
        System.out.print(prompt);
        int n = scan.nextInt();
        scan.nextLine();
        return n;
    }
}
