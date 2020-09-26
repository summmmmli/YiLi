package Assignment2;

public class ArrayMaxSum {

	 public static int maxSubArray(int[] array) {
	     
	        if (array.length == 0) {
	            return 0;
	        }
	        int Sum = 0; 
	        int Max = 0; 
	        for (int i = 0; i < array.length; i++) {
	           if(Sum > 0){      
	               Sum += array[i];
	           }else{
	               Sum = array[i];
	           }
	           if(Sum > Max){
	               Max = Sum;
	           }
	       }
	       return Max;
	    }  
	    
	    public static void main(String[] args) {
	  int[] array = {-2,1,-3,4,-1,2,1,-5,4};
	        int result = maxSubArray(array);
	        System.out.println("The largest contiguous subarray：" + result);
	 }
	}

