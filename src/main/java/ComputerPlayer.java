public class ComputerPlayer extends Player {
    public ComputerPlayer(char mark) {
        super(mark);
    }

    @Override
    public void makeMove(GameBoard board) {
        while (true) {
            byte cell;
            cell = (byte) ((Math.random() * 9) + 1);
            if (board.placeMark(cell, mark)) {
                System.out.println("Computer chose cell: " + cell);
                break;
            }
        }

    }
}
