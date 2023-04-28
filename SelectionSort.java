//Time Complexity is O(n^2)
public class SelectionSort {
    public static void printarry(int arr[]){    
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={9,5,10,4,11,3};
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
        printarry(arr);
    }
    
}
