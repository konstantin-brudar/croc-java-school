package task_k_1_star;

import task_k_1_star.PeakLoadCounter;

public class Test_task_k_1_star {
    public static void main(String[] args) {
        System.out.println("Test PeakLoadCounter:");
        String file = "file.txt";
        System.out.println("Log file: " + file);
        PeakLoadCounter counter = new PeakLoadCounter(file);
        System.out.println("Peak load = " + counter.getPeakLoad());
    }
}
