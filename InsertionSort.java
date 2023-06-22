//import java.rmi.StubNotFoundException;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={1,0,9,8,2,0,0};
        int k;
        int i;
        for(int j=1;j<arr.length;j++){
            k=arr[j];
            i=j-1;
            while(i>=0 && arr[i]>k){
               arr[i+1]=arr[i];
               arr[i]=k;
           i--;               
        }
            }
             for(int e:arr){
            System.out.print(e +" "); 
        }
        
    }
}
