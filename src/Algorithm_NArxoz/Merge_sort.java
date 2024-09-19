package Algorithm_NArxoz;
import java.util.Arrays;
public class Merge_sort {

        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int mid = (left + right) / 2;

                // Сортируем левую и правую половины
                mergeSort(arr, left, mid);
                mergeSort(arr, mid + 1, right);

                // Сливаем отсортированные половины
                merge(arr, left, mid, right);
            }
        }

        public static void merge(int[] arr, int left, int mid, int right) {
            int n1 = mid - left + 1;
            int n2 = right - mid;

            // Временные массивы для левой и правой половины
            int[] L = new int[n1];
            int[] R = new int[n2];

            for (int i = 0; i < n1; i++) {
                L[i] = arr[left + i];
            }
            for (int j = 0; j < n2; j++) {
                R[j] = arr[mid + 1 + j];
            }

            // Индексы для левой (i), правой (j) и объединённой (k) частей
            int i = 0, j = 0, k = left;

            // Сливаем элементы во временных массивах обратно в исходный
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            // Копируем оставшиеся элементы из левого массива
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            // Копируем оставшиеся элементы из правого массива
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        public static void main(String[] args) {
            int[] arr = {38, 27, 43, 3, 9, 82, 10};
            System.out.println("Original array: " + Arrays.toString(arr));

            mergeSort(arr, 0, arr.length - 1);

            System.out.println("Sorted array: " + Arrays.toString(arr));
        }
    }

