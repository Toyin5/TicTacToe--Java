import java.util.Scanner;

public class AiTictacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Board game = new Board();
        Computer comp = new Computer();
        String player;
        int turn,pos;
        System.out.println("Who is going first?? \t 1 - for Human \t 2 - for computer");
        game.templateBoard();
        turn = input.nextInt();
        for (int i = 0; i < 9; ++i) {
            if (turn == 1){
                player = "Human";
                System.out.println(player + "'s turn. Enter the position you want to play");
                pos = input.nextInt();
            }else{
                player = "Computer";
                System.out.println(player + "'s turn. Enter the position you want to play");
                pos = comp.move();
            }
            if (game.checkOccupied(pos)) {
                System.out.println("Space Occupied!");
                i--;
            } else {
                game.move(turn, pos);
                game.display();
                if (game.check_win()) {
                    System.out.println(player + " won");
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