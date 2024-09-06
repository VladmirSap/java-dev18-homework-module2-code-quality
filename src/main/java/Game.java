public class Game {
    private final GameBoard board;
    private Player currentPlayer;
    private final Player playerX;
    private final Player playerO;
    private boolean boxEmpty = false;

    public Game() {
        board = new GameBoard();
        playerX = new HumanPlayer('X');
        playerO = new ComputerPlayer('O');
        currentPlayer = playerX;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
    }

    public void play() {
        boolean gameWon = false;
        boolean gameDraw = false;
        boolean isHumanPlayer = (currentPlayer == playerX);

        while (!gameWon && !gameDraw) {
            board.printBoard();
            if (!boxEmpty) {
                board.clearBoard();
                boxEmpty = true;
            }
            currentPlayer.makeMove(board);

            if (board.checkForWin(currentPlayer.getMark())) {
                gameWon = true;
                board.printBoard();
                if (isHumanPlayer) {
                    System.out.println("You " + (currentPlayer == playerX ? "win" : "lost") + " the game!");
                }

            } else if (board.isFull()) {
                gameDraw = true;
                board.printBoard();
                System.out.println("The game is a draw!");
            } else {
                switchPlayer();
            }
        }
    }

//    public static void main(String[] args) {
//        Game game = new Game();
//        game.play();
//    }
}
