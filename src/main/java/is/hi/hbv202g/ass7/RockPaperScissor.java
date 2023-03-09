package is.hi.hbv202g.ass7;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        int Player1;
        int Player2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Player 1, what is your choice? (0 for rock, 1 for paper, 2 for scissor): ");
        Player1 = sc.nextInt();
        System.out.println("Player 2, what is your choice? (0 for rock, 1 for paper, 2 for scissor): ");
        Player2 = sc.nextInt();

        System.out.println("Player 1: " + Player1);
        System.out.println("Player 2: " + Player2);

        if (Player1 == 0 && Player2 == 2) {
            System.out.println("Player 1 wins!");
        }
        else if (Player1 == 1 && Player2 == 0) {
            System.out.println("Player 1 wins!");
        }
        else if (Player1 == 2 && Player2 == 1) {
            System.out.println("Player 1 wins!");
        }
        else if (Player1 == 0 && Player2 == 1) {
            System.out.println("Player 2 wins!");
        }
        else if (Player1 == 1 && Player2 == 2) {
            System.out.println("Player 2 wins!");
        }
        else if (Player1 == 2 && Player2 == 0) {
            System.out.println("Player 2 wins!");
        }
        else {
            System.out.println("It's a draw!");
        }



    }
}
