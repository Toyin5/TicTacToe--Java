
/**
 * CharBoard
 */
class CharBoard extends Board {
    private char board[][] = new char[3][3];

    CharBoard(){
        //constructor
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '0';
            }
        }
    }

    // @Override
    public void move(char turn, int pos) {
        switch (pos) {
            case 1:
                board[0][0] = turn;
                break;
            case 2:
                board[0][1] = turn;
                break;
            case 3:
                board[0][2] = turn;
                break;
            case 4:
                board[1][0] = turn;
                break;
            case 5:
                board[1][1] = turn;
                break;
            case 6:
                board[1][2] = turn;
                break;
            case 7:
                board[2][0] = turn;
                break;
            case 8:
                board[2][1] = turn;
                break;
            case 9:
                board[2][2] = turn;
                break;
        }
    }
}