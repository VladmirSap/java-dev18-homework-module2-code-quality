import java.util.Scanner;

public class HumanPlayer extends Player{
    public HumanPlayer(char mark) {
        super(mark);
    }

    @Override
    public void makeMove(GameBoard board) {
        Scanner scanner = new Scanner(System.in);
        byte cell;
        while (true) {
            System.out.print("Please enter cell from 1 to 9: ");
            cell = scanner.nextByte();
            if (board.placeMark(cell, mark)) {
                break;
            } else {
                System.out.println("This move is not valid. Please select another cell.");
            }
        }
    }
}
