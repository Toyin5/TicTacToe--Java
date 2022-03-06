/**
 * Board
 */
class Board{
    //Board size
    private int board[][] = new int[3][3];

    Board(){
        //constructor
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 0;
            }
        }
    }
    public void display() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void templateBoard(){
        int x = 1;
        System.out.println("The table is as follows. Each number represent a cell. Enter the number to move to...");
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + x + " ");
                x++;
            }
            System.out.println();
        }
    }

    private int getPosition(int pos){
        /**
         * gets postion as follows:-
         * each cell represents a number as follows
         * 1        2       3 
         * 4        5       6
         * 7        8       9
         */
        int position = -1;
        switch (pos) {
            case 1:
                position =  board[0][0];
                break;
            case 2:
                position = board[0][1];
                break;
            case 3:
                position = board[0][2];
                break;
            case 4:
                position = board[1][0];
                break;
            case 5:
                position = board[1][1];
                break;
            case 6:
                position = board[1][2];
                break;
            case 7:
                position = board[2][0];
                break;
            case 8:
                position = board[2][1];
                break;
            case 9:
                position = board[2][2];
                break;
        }
        return position;
    }
    public void move(int turn, int pos){
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

    public boolean checkOccupied(int pos){
         // check if a particular cell is empty or not
         int get = getPosition(pos);
         if((get == 1) || (get == 2)){
             return true;
         }else{
             return false;
         }
    }

    public boolean check_win(){
        // vertical and horizontal matching
         if ((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]) && ((board[0][2] == 1) || (board[0][2] == 2))){
            return true;
        }
        else if ((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]) && ((board[1][2] == 1) || (board[1][2]) == 2)){
                return true;
        }
        else if ((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]) && ((board[2][2] == 1) || (board[2][2]) == 2)){
            return true;
        } 
        else if ((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]) && ((board[2][0] == 1) || (board[2][0]) == 2)){
            return true;
        }
        else if ((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]) && ((board[2][1] == 1) || (board[2][1]) == 2)){
            return true;
        } 
        else if ((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]) && ((board[2][2] == 1) || (board[2][2]) == 2)){
            return true;
        }
        // diagonal matching
        else if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]) && ((board[2][2] == 1) || (board[2][2]) == 2)){
            return true;
        }
        else if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]) && ((board[2][0] == 1) || (board[2][0]) == 2)){
            return true;
        }
        else {
            return false;
        }   
    }  
}