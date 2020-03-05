package task_3;

public class ChessFigurePosition {
    private int xIndex;
    private int yIndex;

    public static final int BOARD_SIZE = 8;

    private static final String xIndexMapping = "abcdefgh";

    public ChessFigurePosition(int xIndex, int yIndex) {
        if (!isIndexValid(xIndex)) {
            throw new IllegalArgumentException(xIndexOutOfBoundsErrorMessage(xIndex));
        }
        if (!isIndexValid(yIndex)) {
            throw new IllegalArgumentException(yIndexOutOfBoundsErrorMessage(yIndex));
        }
        this.xIndex = xIndex;
        this.yIndex = yIndex;
    }

    public int getX() {
        return xIndex;
    }

    public int getY() {
        return yIndex;
    }

    public void setX(int xIndex) {
        if (!isIndexValid(xIndex)) {
            throw new IllegalArgumentException(xIndexOutOfBoundsErrorMessage(xIndex));
        }
        this.xIndex = xIndex;
    }

    public void setY(int yIndex) {
        if (!isIndexValid(yIndex)) {
            throw new IllegalArgumentException(yIndexOutOfBoundsErrorMessage(yIndex));
        }
        this.yIndex = yIndex;
    }

    private boolean isIndexValid(int n) {
        return n >= 0 && n < BOARD_SIZE;
    }

    private String xIndexOutOfBoundsErrorMessage(int n) {
        return "Index X = " + n + " is wrong. It must be number between 0 and " + (BOARD_SIZE - 1);
    }

    private String yIndexOutOfBoundsErrorMessage(int n) {
        return "Index Y = " + n + " is wrong. It must be number between 0 and " + (BOARD_SIZE - 1);
    }

    @Override
    public String toString() {
        return Character.toString(xIndexMapping.charAt(xIndex)) + (yIndex + 1);
    }
}
