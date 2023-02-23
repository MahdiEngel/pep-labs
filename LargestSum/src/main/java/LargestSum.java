
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean foundDuplicate = false;
        
        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
                foundDuplicate = false;
            } else if (num == largest) {
                foundDuplicate = true;
            } else if (num > secondLargest) {
                secondLargest = num;
                foundDuplicate = false;
            } else if (num == secondLargest) {
                foundDuplicate = true;
            }
        }
        
        if (foundDuplicate) {
            return largest * 2;
        } else {
            return largest + secondLargest;
        }
    }
}

    /*public int bigSum(List<Integer> nums) {
        if (nums == null || nums.size() == 0) {
            return 0;
        }
        if (nums.size() == 1) {
            return nums.get(0);
        }
        return Math.max(
            nums.get(0) + bigSum(nums.subList(2, nums.size())),
            bigSum(nums.subList(1, nums.size())));
    }
}*/