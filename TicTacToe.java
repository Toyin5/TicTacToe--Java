// import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Board game = new Board();
        int turn,pos;
        System.out.println("Who is going first?? \t 1 - for player 1 \t 2 - for player 2");
        game.templateBoard();
        turn = input.nextInt();
        for (int i = 0; i < 9; i++) {
            System.out.println("Player " + turn + "'s turn. Enter the position you want to play");
            pos = input.nextInt();
            if (game.checkOccupied(pos)) {
                System.out.println("Space Occupied!");
                i--;
            } else {
                game.move(turn, pos);
                game.display();
                if (game.check_win()) {
                    System.out.println("Player " + turn + "won");
                    break;
                } else {
                    if (turn == 1){
                        turn = 2;
                    }else{
                        turn = 1;
                    }
                }
            }
        }
        input.close();
    }
}