public class InsertionSort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
    int arr[]={7,4,9,2,67,12};
 
 
        //insertion sort
        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
                while(j >= 0 && arr[j] > temp) {
                    //Keep swapping
                    arr[j+1] = arr[j];
                    j--;
                }
            arr[j+1] = temp;
        }
        printArray(arr);
    }
 }
 
