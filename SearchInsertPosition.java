public class SearchInsertPosition{
     static int searchInsert(int[] nums, int target) {
       
         int start=0;
    int end=nums.length-1;
     if(target<nums[0])
        return start;
    while(start<=end){
        int mid=(end+start)/2;
    if(target==nums[mid])
    return mid;
    else if(target>nums[mid])
    start=mid+1;
    else if(target<nums[mid])
    end=mid-1;
    }
    if(start==0)
    return start+1;
return end+1;
        
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int result=searchInsert(arr, 7);
        System.out.println(result);
    }

}
