package practical_task_1;

public class Rgb implements Color {
    private int red;
    private int green;
    private int blue;

    public Rgb(int r, int g, int b) {
        if (r < 0 || r > 255)
            throw new IllegalArgumentException("R must be between 0 and 255");

        if (g < 0 || g > 255)
            throw new IllegalArgumentException("G must be between 0 and 255");

        if (b < 0 || b > 255)
            throw new IllegalArgumentException("B must be between 0 and 255");

        red = r;
        green = g;
        blue = b;
    }

    public Rgb(int color) {
        red = (color >> 16) & 0xFF;
        green = (color >> 8) & 0xFF;
        blue = color & 0xFF;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    @Override
    public int toRgb() {
        return red << 16 | green << 8 | blue;
    }
}