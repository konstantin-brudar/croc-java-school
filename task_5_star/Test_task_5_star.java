package task_5_star;

import task_5_star.PeakLoadCounter;

public class Test_task_5_star {
    public static void main(String[] args) {
        System.out.println("Test PeakLoadCounter:");
        String file = "file.txt";
        System.out.println("Log file: " + file);
        PeakLoadCounter counter = new PeakLoadCounter(file);
        System.out.println("Peak load = " + counter.getPeakLoad());
    }
}
