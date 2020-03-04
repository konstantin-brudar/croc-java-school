package practical_task_1;

public interface Color {
    int toRgb();

    public default double distanceTo(Color other) {
        Rgb first = (this instanceof Rgb) ? (Rgb) this : new Rgb(toRgb());
        Rgb second = (other instanceof Rgb) ? (Rgb) other : new Rgb(other.toRgb());
        return Math.sqrt(Math.pow(second.getRed() - first.getRed(), 2) +
                Math.pow(second.getGreen() - first.getGreen(), 2) + Math.pow(second.getBlue() - first.getBlue(), 2));
    }
}