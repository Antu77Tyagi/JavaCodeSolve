import java.util.Arrays;
import java.util.Scanner;

public  class MergeSortedArr {
    public static void main(String[] args) {
        int n=0,m=1;
        int arr1[]={0};
        int arr2[]={1};
        // Scanner sc=new Scanner(System.in);
        // int arr1[]=new int[n+m];
        // int arr2[]=new int [m];
        // System.out.println("enter the first array element");
        // for(int i=0;i<n;i++){
        //     arr1[i]=sc.nextInt();
        // }
        // System.out.println("enter the second array element");
        // for(int i=0;i<m;i++){
        //     arr2[i]=sc.nextInt();
        // }
        // System.out.println("before");
        // for(int i=0;i<arr1.length;i++){
        //     System.out.print(arr1[i]+" ");
        // }
        
        for(int i=0;i<arr2.length;i++){
              if(n<arr1.length){
            arr1[n]=arr2[i];
            n++;
            }
        }
        Arrays.sort(arr1);
        System.out.println("after");
        System.out.println();
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
    
}