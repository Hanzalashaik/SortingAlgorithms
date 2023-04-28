public class BubbleSort {
    public static void printarray(int arr[]){    
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int i,int j){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 70, 30, 880, 0 };

        for(int i=0;i<arr.length-1;i++){
            // last ke elements ko skip karne ke liye i for loop use hora 
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //calling swap function
                   swap(arr, i, j);
                }
            }
        }
        //callin print function
        printarray(arr);
    }
}
