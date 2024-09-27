package Algorithm_NArxoz;
import java.util.Random;

public class QuickSortVariants {
    public static void main(String[] args) {
        int[] array1 = {3, 6, 8, 10, 1, 2, 1};
        int[] array2 = array1.clone();
        quickSort(array1, 0, array1.length - 1);
        System.out.println("Standard QuickSort: " + arrayToString(array1));
        randomPivotQuickSort(array2, 0, array2.length - 1);
        System.out.println("Random Pivot QuickSort: " + arrayToString(array2));
        int[] array3 = {3, 6, 8, 10, 1, 2, 1};
        medianOfThreeQuickSort(array3, 0, array3.length - 1);
        System.out.println("Median-of-Three QuickSort: " + arrayToString(array3));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void randomPivotQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = low + new Random().nextInt(high - low);
            swap(arr, pivotIndex, high);
            int pi = partition(arr, low, high);
            randomPivotQuickSort(arr, low, pi - 1);
            randomPivotQuickSort(arr, pi + 1, high);
        }
    }

    public static void medianOfThreeQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = medianOfThree(arr, low, high);
            swap(arr, pivotIndex, high);
            int pi = partition(arr, low, high);
            medianOfThreeQuickSort(arr, low, pi - 1);
            medianOfThreeQuickSort(arr, pi + 1, high);
        }
    }

    public static int medianOfThree(int[] arr, int low, int high) {
        int mid = low + (high - low) / 2;
        if (arr[low] > arr[mid]) swap(arr, low, mid);
        if (arr[low] > arr[high]) swap(arr, low, high);
        if (arr[mid] > arr[high]) swap(arr, mid, high);
        return mid;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}
