package task_3;

import task_3.ChessFigurePosition;

public class Test_task_3 {
    public static void main(String[] args) {
        ChessFigurePosition p1 = new ChessFigurePosition(1, 1);
        System.out.println(p1);

        ChessFigurePosition p2 = new ChessFigurePosition("b3");
        System.out.println(p2);

        ChessFigurePosition p3 = new ChessFigurePosition(-1, 8);
        ChessFigurePosition p4 = new ChessFigurePosition("w9_");
    }
}
