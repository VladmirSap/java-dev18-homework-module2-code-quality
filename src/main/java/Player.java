public abstract class Player {
    protected char mark;

     Player(char mark) {
        this.mark = mark;
    }

    public char getMark() {
        return mark;
    }

    public abstract void makeMove(GameBoard board);
}
