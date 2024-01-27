public class MoveZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {1, 0, 5, 9, 0, 8, 0, 7};

        System.out.print("Original Array: ");
        printArray(arr);

        moveZerosToEnd(arr);

        System.out.print("\nArray after moving zeros to the end: ");
        printArray(arr);
    }

    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        // Traverse the array, and move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
