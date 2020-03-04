package practical_task_1;

public class Grayscale implements Color {
    private int value;

    public Grayscale(int v) {
        if (v < 0 || v > 255 )
            throw new IllegalArgumentException ("Value must be between 0 and 255");
        value = v;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int toRgb() {
        return value << 16 | value << 8 | value;
    }
}
