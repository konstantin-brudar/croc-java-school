package practical_task_1;

public class Palette {
    private int N;
    private Color[] colors;

    public Palette(int N) {
        if (N < 0)
            throw new IllegalArgumentException("Expected N > 0");
        this.N = N;
        colors = new Color[N];
    }

    public Palette(Color[] colors) {
        if (colors == null || colors.length == 0)
            throw new IllegalArgumentException("Empty palette");
        this.colors = colors;
        N = colors.length;
    }

    public Color getColor(int index) {
        if (index < 0 || index >= N)
            throw new IllegalArgumentException("Index out of bounds");
        return colors[index];
    }

    public void setColor(int index, Color color) {
        if (index < 0 || index >= N)
            throw new IllegalArgumentException("Index out of bounds");
        if (color == null)
            throw new IllegalArgumentException("Color is null");
        colors[index] = color;
    }

    public Color getClosestColor(Color target) {
        if (target == null)
            throw new IllegalArgumentException("Target is null");
        Color minColor = colors[0];
        double minDistance = target.distanceTo(colors[0]);
        for (Color c : colors) {
            if (target.distanceTo(c) < minDistance) {
                minColor = c;
                minDistance = target.distanceTo(c);
            }
        }
        return minColor;
    }
}