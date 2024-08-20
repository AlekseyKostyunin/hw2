package task3;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 0, 0, 0};
        int[] array3 = {1, 3, 5};
        System.out.println(hasZeroNeighbors(array1)); // false
        System.out.println(hasZeroNeighbors(array2)); // true
        System.out.println(hasZeroNeighbors(array3)); // false
    }

    public static boolean hasZeroNeighbors(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}