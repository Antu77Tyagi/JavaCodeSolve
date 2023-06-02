public class RotateAnArrayK {
    static void rotate(int arr[],int k){
       k=k%arr.length;
           rev(arr,0,arr.length-1);
         rev(arr,0,k-1);
         rev(arr,k,arr.length-1);
    }
    static void rev(int arr[],int low,int high){
        while(low<high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
            }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        rotate(arr, 3);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
