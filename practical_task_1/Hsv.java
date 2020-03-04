package practical_task_1;

public class Hsv implements Color {
    private int hue;
    private int saturation;
    private int value;

    public Hsv(int h, int s, int v) {
        if (h < 0 || h > 360 )
            throw new IllegalArgumentException ("H must be between 0 and 360");

        if (s < 0 || s > 100 )
            throw new IllegalArgumentException ("S must be between 0 and 100");

        if (v < 0 || v > 100 )
            throw new IllegalArgumentException ("V must be between 0 and 100");

        hue = h;
        saturation = s;
        value = v;
    }

    public int getHue() {
        return hue;
    }

    public int getSaturation() {
        return saturation;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int toRgb() {
        int hi = (int)Math.floor((double)hue / 60) % 6;
        double vmin = (double) ((100 - saturation) * value) / 100;
        double a = (value - vmin) * (double)(hue % 60) / 60;
        double vinc = vmin + a;
        double vdec = value - a;
        switch (hi) {
            case 0:
                return to256(value) << 16 | to256(vinc) << 8 | to256(vmin);
            case 1:
                return to256(vdec) << 16 | to256(value) << 8 | to256(vmin);
            case 2:
                return to256(vmin) << 16 | to256(value) << 8 | to256(vinc);
            case 3:
                return to256(vmin) << 16 | to256(vdec) << 8 | to256(value);
            case 4:
                return to256(vinc) << 16 | to256(vmin) << 8 | to256(value);
            case 5:
                return to256(value) << 16 | to256(vmin) << 8 | to256(vdec);
        }
        throw new IllegalStateException();
    }

    private int to256(double v) {
        return (int)(v * 255 / 100);
    }
}
