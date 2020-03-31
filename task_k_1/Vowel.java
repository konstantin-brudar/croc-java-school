package task_k_1;

public class Vowel {
    public static void main(String[] args) {
        testIsVowel();
    }

    private static void testIsVowel() {
        System.out.println("Test isVowel():");
        System.out.println("a: " + (isVowel('a') ? "yes" : "no"));
        System.out.println("b: " + (isVowel('b') ? "yes" : "no"));
        System.out.println();
    }

    public static boolean isVowel(char letter) {
        final char[] VOWELS = new char[] {'A','E','I','O','U'};

        for (char vowel : VOWELS) {
            if (Character.toUpperCase(letter) == vowel) {
                return true;
            }
        }

        return false;
    }
}
