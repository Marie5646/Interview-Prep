package src;

public class sortArr {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 6, 6, 4, 4, 5};

        // Call the removeDuplicates method to modify the 'nums' array and get the length of the modified array.
        int length = removeDuplicates(nums);

        // Print the modified array with comments.
        System.out.print("Modified Array (Unique Elements): ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println(); // Print a new line.

        // Print the original 'nums' array with comments.
        System.out.print("Original Array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int index = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }

        return index;
    }

    class Solution {
        public int maxProfit(int[] prices) {
            int maxPrice = 0;
            int profit = 0;
            for(int i=0;i<prices.length;i++){
                for(int j=i+1;i<prices.length;j++){
                    if(j<i){
                        maxPrice = prices[j];
                        j++;
                    }
                }
            }
            return maxPrice;
        }
    }

}
