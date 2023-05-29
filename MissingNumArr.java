package ArrayQuestions;

public class MissingNumArr {

	public static void main(String[] args) {
		int arr[]= {7,8,9,10,12};
		int k=arr[0]-1;
		int n=arr[arr.length-1];
		int mis;
		  int sum=((n*(n+1))/2)-(k*(k+1)/2);
		 int res=0;
		 for(int i=0;i<arr.length;i++) {
			 res=res+arr[i];
		 }
		 mis=sum-res;
		 System.out.print(mis);
	}

}
