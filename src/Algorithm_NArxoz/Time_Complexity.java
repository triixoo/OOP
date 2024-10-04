package Algorithm_NArxoz;

public class Time_Complexity {
    static int findElement(int arr[], int n, int key){
        int i;
        for(i=0; i<n; i++){
            if(arr[i] == key){
                return i;

            }
        }
        return -1;
    }
    static int deleteElement(int arr[], int n, int key){
        int pos = findElement(arr, n, key);
        if(pos == -1){
            System.out.println("Element not found");
            return n;
        }
        int i;
        for(i=pos; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        return n-1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 50, 30, 70, 80, 20};
        int n = arr.length;

        System.out.println("Array before deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int key = 30;
        n = deleteElement(arr, n, key);

        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

