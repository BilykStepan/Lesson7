import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * Приберіть дужки коментування для виклику необхідного методу.
     */
    public static void main(String[] args) {
        //mathMethods.getValueMultiplier();
        //mathMethods.getOddSum();
        //mathMethods.getIndex();
        //mathMethods.sortArrayByDecremental();
        //mathMethods.sortArrayByIncrementation();
        //mathMethods.getQuantityEvenElements();
        //mathMethods.getQuantityOddElements();
        //mathMethods.getQuantityOfElementsMultiplesOfFive();
        //mathMethods.getSumOfEachSecondArrayElement();
    }
    static class mathMethods {
        static int[] array = {0, -25, 12, 123, 77, 18, 39, 24, 55, 150};
        /**
         * Виводить елементи кратні трьом.
         */
        static void getValueMultiplier() {
            for (int i = 0; i < array.length; i++) {
                if ((i % 3 == 0) && (i != 0)) {
                    System.out.println(i);
                }
            }
        }
        /**
         * Виводить суму непарних елементів.
         */
        static void getOddSum() {
            int sum = 0;
            for (int j = 0; j < array.length ; j++) {
                if ((j % 2) != 0) {
                    sum = sum + j;
                }
            }
            System.out.println(sum);
        }
        /**
         * Виводить індекси заданих елементів.
         */
        static void getIndex(int[] array) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter element of array [0, -25, 12, 123, 77, 18, 39, 24, 55, 150] to get index:");
            int element = input.nextInt();
            for (int k = 0; k < mathMethods.array.length; k++) {
                if (element== mathMethods.array[k]) {
                    System.out.println("Element " + element + " has index " + k);
                }
            }
        }
        /**
         * Виводить відсортований за зростанням массив.
         */
        static void sortArrayByIncrementation() {
            for (int n = 0; n < array.length - 1; n++) {
                for (int o = array.length - 1; o > n; o--) {
                    if (array[o - 1] > array[o]) {
                        int temp = array[o - 1];
                        array[o - 1] = array[o];
                        array[o] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
        /**
         * Виводить відсортований за зменшенням массив.
         */
        static void sortArrayByDecremental() {
            for (int l = 0; l < array.length - 1; l++) {
                for (int m = array.length - 1; m > l ; m--) {
                    if (array[m - 1] < array[m]) {
                            int temp = array[m - 1];
                            array[m - 1] = array[m];
                            array[m] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
        }
        /**
         * Виводить кількість парних елементів.
         */
        static void getQuantityEvenElements() {
            int evenQuantity = 0;
            for (int p = 0; p < array.length; p++) {
                if ((array[p] % 2 == 0) && array[p] != 0) {
                    evenQuantity++;
                }
            }
            System.out.println(evenQuantity);
        }
        /**
         * Виводить кількість непарних елементів.
         */
        static void getQuantityOddElements() {
            int oddQuantity = 0;
            for (int r = 0; r < array.length; r++) {
                if ((array[r] % 2 != 0) && array[r] != 0) {
                    oddQuantity++;
                }
            }
            System.out.println(oddQuantity);
        }
        /**
         * Виводить кількість елементів кратних 5.
         */
        static void getQuantityOfElementsMultiplesOfFive() {
            int quantityMultiplesFive = 0;
            for (int s = 0; s < array.length; s++) {
                if ((array[s] % 5 == 0) && array[s] !=0) {
                    quantityMultiplesFive++;
                }
            }
            System.out.println(quantityMultiplesFive);
        }
        /**
         * Виводить сумму кожного другого елементу массиву.
         */
        static void getSumOfEachSecondArrayElement() {
            int sum = 0;
            for (int t = 0; t < array.length; t++) {
                if (t % 2 != 0) {
                    sum = sum + array[t];
                }
            }
            System.out.println(sum);
        }
    }
}