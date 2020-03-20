package task_5;

public class Swap {
    public static void main(String[] args) {
        testSwap();
    }

    private static void testSwap() {
        System.out.println("Test swap():");
        char[] letters = new char[] {'a', 'b', 'c', 'd'};
        System.out.print("swap 0 and 2 letters: " + new String(letters) + " -> ");
        swap(letters, 0, 2);
        System.out.println(letters);
        System.out.println();
    }

    public static void swap(char[] letters, int i, int j)
    {
        if (letters == null || letters.length == 0) {
            throw new IllegalArgumentException("Argument letters is empty or null.");
        }
        if (i < 0 || i >= letters.length) {
            throw new IllegalArgumentException("Index " + i + " is out of bounds.");
        }

        if (j < 0 || j >= letters.length) {
            throw new IllegalArgumentException("Index " + j + " is out of bounds.");
        }

        if (i == j || letters[i] == letters[j]) {
            return;
        }

        char temp = letters[i];
        letters[i] = letters[j];
        letters[j] = temp;
    }
}
