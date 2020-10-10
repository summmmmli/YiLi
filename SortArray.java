package assignment4;

public class SortArray {

	public static void findk(int k, int[] array){
        if(k > array.length || k <= 0) {
            System.out.println("Out of range, please enter another K");
        } else {
        int temp = 0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]<array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
               }
           }
        }
        System.out.println(array[k - 1]);
        }
    }
    
    
    public static void main(String args[]) {
      int[] array = {3, 2, 1, 5, 6, 4};
      int k = 2;
      findk(k, array);
      
      int[] array2 = {3,2,3,1,2,4,5,5,6};
      int k2 = 4;
      findk(k2, array2);
    }

}
