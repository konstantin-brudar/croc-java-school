package task_k_1;

import task_k_1.Vowel;
import task_k_1.Swap;

public class RearrangeVowels {
    public static void main(String[] args) {
        testRearrangeVowels();
    }

    private static void testRearrangeVowels() {
        System.out.println("Test rearrangeVowels():");
        System.out.println("palindrome" + " -> " + rearrangeVowels("palindrome"));
        System.out.println("abocu" + " -> " + rearrangeVowels("abocu"));
        System.out.println("a" + " -> " + rearrangeVowels("a"));
        System.out.println();
    }

    public static String rearrangeVowels(String word) {
        char[] letters = word.toCharArray();

        int indexFirstVowel = 0;
        int indexLastVowel = letters.length - 1;

        while (indexFirstVowel < indexLastVowel) {
            boolean isFirstVowelFound = false;
            boolean isLastVowelFound = false;

            while (indexFirstVowel < indexLastVowel) {
                if (Vowel.isVowel(letters[indexFirstVowel])) {
                    isFirstVowelFound = true;
                    break;
                }
                indexFirstVowel++;
            }

            while (indexLastVowel > indexFirstVowel) {
                if (Vowel.isVowel(letters[indexLastVowel])) {
                    isLastVowelFound = true;
                    break;
                }
                indexLastVowel--;
            }

            if (isFirstVowelFound && isLastVowelFound) {
                Swap.swap(letters, indexFirstVowel, indexLastVowel);
            }

            indexFirstVowel++;
            indexLastVowel--;
        }

        return new String(letters);
    }
}
