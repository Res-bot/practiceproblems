public class day1 {
    public static void main(String[] args) {

        // program to find the largest number in a given array
        int[] arr = { 25, 7, 45, 6, 78, 1, 4, 5, 89, 100 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Greatest element of the array is: " + max);
        System.out.println("Least element of the array is : " + min);

        // program to find the sum of all elements of the array

        int[] arr1 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int sum = 0;
        for (int k = 0; k <= arr1.length - 1; k++) {
            sum += arr1[k];
        }
        System.out.println("The sum of all the elements of the array is: " + sum);

        // program to reverse an array

        System.out.println("Actual array: ");
        for (int l = 0; l < arr1.length; l++) {
            System.out.print(arr1[l] + " ");
        }
        System.out.println();

        System.out.println("Reversed array: ");
        for (int m = arr1.length - 1; m >= 0; m--) {
            System.out.print(arr1[m] + " ");
        }
        System.out.println();

        // program to check if an array is sorted
        int[] arr2 = { 2, 8, 6, 7, 3, 9, 4, 5, 1 };
        boolean isSorted = true;
        System.out.println("new array: ");
        for (int c = 0; c < arr2.length; c++) {
            System.out.print(arr[c] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] > arr2[i + 1]) {
                isSorted = false;
            } else {
                isSorted = true;
            }
        }
        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }

        // java program to find the second largest and second smallest element from the
        // array
        int[] arr3 = { 8, 7, 9, 5, 4, 6, 3, 78, 89, 98, 56, 54, 45, 56, 12, 23, 25 };
        int larges = Integer.MIN_VALUE;
        int seclarge = Integer.MIN_VALUE;
        int smalles = Integer.MAX_VALUE;
        int secsmall = Integer.MAX_VALUE;

        System.out.println("the new array: ");
        for (int c = 0; c < arr3.length - 1; c++) {
            System.out.print(arr3[c] + " ");
        }
        System.out.println();

        for (int k = 0; k < arr3.length; k++) {
            if (arr3[k] > larges) {
                seclarge = larges;
                larges = arr3[k];
            }
            if (arr3[k] < smalles) {
                secsmall = smalles;
                smalles = arr3[k];
            }

        }
        System.out.println("the largest element in the array is : " + larges);
        System.out.println("the smallest element in the array is : " + smalles);

        System.out.println("the second largest element in the array is : " + seclarge);
        System.out.println("the second smallest element in the array is : " + secsmall);

    }
}
