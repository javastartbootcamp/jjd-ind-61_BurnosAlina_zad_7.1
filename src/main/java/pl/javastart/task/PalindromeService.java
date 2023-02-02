package pl.javastart.task;

public class PalindromeService {

    // nie zmieniaj sygnatury tej metody. Jest ona testowana w PalindromeServiceTest
    public boolean isPalindrome(int[] array) {
        if (array != null && !checkArrayFilledByZeros(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != array[(array.length - 1) - i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean checkArrayFilledByZeros(int[] array) {
        for (int j : array) {
            if (j == 0) {
                continue;
            }
            return false;
        }
        return true;
    }
}

