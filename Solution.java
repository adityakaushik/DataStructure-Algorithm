public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
        int k=arr.length;
        int[][] arr2=new int[s][2];
        int status=0;
        
        for(int i=0;i<arr.length/2; i++){
        	
        	for(int j=arr.length-1; j>=0; j--) {
        		
        		 if((arr[i]+arr[j])==s){
//                 	System.out.println(arr[i]);
//                	System.out.println(arr[j]);
//                	System.out.println("----------");
                 	arr2[status][0]=arr[i];
                	arr2[status][1]=arr[j];
                	
              		status=status+1;
               	
        	}

            }
        }
        return arr2;
    }
    public static void main (String args[]) {
    	int[] arr= {1, 2, 3, 4, 5};
    
    	System.out.println(pairSum(arr,5));

	}
}