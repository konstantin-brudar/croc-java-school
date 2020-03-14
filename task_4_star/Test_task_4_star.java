package task_4_star;

import task_4_star.CombinedLog;

public class Test_task_4_star {
    public static void main(String[] args) {
        try(CombinedLog log = new CombinedLog(args)) {
            String line = null;
            while ((line = log.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
