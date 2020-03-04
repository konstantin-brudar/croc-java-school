package practical_task_1;

public class Demo {
    public static void main(String[] args) {

        Rgb c = new Rgb(137, 55, 12);
        Rgb d = new Rgb(c.toRgb());
        System.out.println(d.getRed() + " " + d.getGreen() + " " + d.getBlue());
    }
}

