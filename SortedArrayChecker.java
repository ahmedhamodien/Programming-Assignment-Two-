import java.util.Arrays;
public class SortedArrayChecker {
    public static boolean isSortedIterative(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isSortedRecursive(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return true;
        }
        return isSortedRecursiveHelper(arr, 0);
    }
    private static boolean isSortedRecursiveHelper(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSortedRecursiveHelper(arr, index + 1);
    }
    public static void main(String[] args) {

        int[] sortedArray = {1, 2, 2, 3, 3, 3, 4, 5};
        System.out.println("--- Scenario 1: Sorted Array ---");
        System.out.println("Input: " + Arrays.toString(sortedArray));

        System.out.println("Iterative Output: " + (isSortedIterative(sortedArray) ? "Sorted" : "Not Sorted"));
        System.out.println("Recursive Output: " + (isSortedRecursive(sortedArray) ? "Sorted" : "Not Sorted"));

        int[] unsortedArray = {1, 3, 4, 9, 5, 4};
        System.out.println("\n--- Scenario 2: Unsorted Array ---");
        System.out.println("Input: " + Arrays.toString(unsortedArray));

        System.out.println("Iterative Output: " + (isSortedIterative(unsortedArray) ? "Sorted" : "Not Sorted"));
        System.out.println("Recursive Output: " + (isSortedRecursive(unsortedArray) ? "Sorted" : "Not Sorted"));
    }
}