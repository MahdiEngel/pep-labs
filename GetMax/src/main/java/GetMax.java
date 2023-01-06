public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
    	int max = arr[0];
    	for (int i = 0; i < arr.length; i++) 
    		if (arr[i] > max)
    			max = arr[i];
    		
        return max;
    }
}



//Initialize maximum element
//int max = arr[0];
 
// Traverse array elements from second and
// compare every element with current max
//for (i = 1; i < arr.length; i++)
   // if (arr[i] > max)
       // max = arr[i];
 
