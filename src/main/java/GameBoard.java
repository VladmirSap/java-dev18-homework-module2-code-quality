import java.util.Arrays;

public class GameBoard {
    char[] box = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    public void printBoard() {

            System.out.println(" " + box[0] + " | " + box[1] + " | " + box[2]);
            System.out.println("---|---|---");
            System.out.println(" " + box[3] + " | " + box[4] + " | " + box[5]);
            System.out.println("---|---|---");
            System.out.println(" " + box[6] + " | " + box[7] + " | " + box[8]);

    }

    public void clearBoard() {
        Arrays.fill(box, ' ');
    }

    public boolean isFull() {
        for (char c : box) {
            if (c == ' ') {
                return false;
            }
        }
        return true;
    }

    public boolean placeMark(byte cell, char mark) {
        if (cell > 0 && cell <= box.length && box[cell - 1] == ' ') {
            box[cell - 1] = mark;
            return true;
        }
        return false;
    }

    public boolean checkForWin(char mark) {
        return (box[0] == mark && box[1] == mark && box[2] == mark) ||
                (box[3] == mark && box[4] == mark && box[5] == mark) ||
                (box[6] == mark && box[7] == mark && box[8] == mark) ||
                (box[0] == mark && box[3] == mark && box[6] == mark) ||
                (box[1] == mark && box[4] == mark && box[7] == mark) ||
                (box[2] == mark && box[5] == mark && box[8] == mark) ||
                (box[0] == mark && box[4] == mark && box[8] == mark) ||
                (box[6] == mark && box[4] == mark && box[2] == mark);
    }


}
