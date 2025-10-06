import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
MainProgram.sort(numbers);

    }

    public static int smallest(int[] arr) {
        int smallestValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallestValue > arr[i]) {
                smallestValue = arr[i];
            }
        }
        
        return smallestValue;
    }

    public static int indexOfSmallest(int[] arr) {
        int smallestValue = arr[0];
        int smallestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (smallestValue > arr[i]) {
                smallestValue = arr[i];
                smallestIndex = i;

            }
        }

        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] arr, int startingIndex) {
        int smallestValue = arr[startingIndex];
        int smallestIndex = startingIndex;

        for (int i = startingIndex; i < arr.length; i++) {
            if (smallestValue > arr[i]) {
                smallestValue = arr[i];
                smallestIndex = i;

            }
        }

        return smallestIndex;

    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));

            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, smallestIndex, i);
        }
    }

}
