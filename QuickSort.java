public class QuickSort {

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int loc = partition(arr, low, high);
            quicksort(arr, low, loc - 1);
            quicksort(arr, loc + 1, high);
        }
    }

    public static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= j && arr[i] < pivot) {
                i++;
            }
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
                // swap(arr, i, j);
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        // swap(arr, i, j);

        return j;
    }
    // public static void swap( int []arr, int i,int j){
    //  int temp=arr[i];
    //  arr[i]=arr[j];
    //  arr[j]=temp;
    // }

    public static void main(String[] args) {
        int arr[] = { 10, 70, 30, 880, 0 };
        int n = arr.length;
        // int arr[]=new int[5];
        // System.out.println("Enter 5 elements:");
        // Scanner ele=new Scanner(System.in);
        // for(int i=0;i<=n;i++){
        //     int a[i]=ele.nextInt();
        // }

        quicksort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}