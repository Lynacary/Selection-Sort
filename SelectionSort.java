import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {

        int[] sortList = new int[5]; // Array with 5 elements
        Random rand = new Random();

        // Fill the array with random integers between 0 and 99
        for (int i = 0; i < sortList.length; i++) {
            sortList[i] = rand.nextInt(100);
        }

        // Print the original array
        System.out.print("Original array: ");
        for (int num : sortList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Selection sort algorithm
        for (int i = 0; i < sortList.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < sortList.length; j++) {
                if (sortList[j] < sortList[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the elements
            int temp = sortList[minIndex];
            sortList[minIndex] = sortList[i];
            sortList[i] = temp;
        }

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : sortList) {
            System.out.print(num + " ");
        }
    }
}