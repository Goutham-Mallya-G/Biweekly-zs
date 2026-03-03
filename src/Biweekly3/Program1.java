package Biweekly3;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,0};
        int target = 1;
        System.out.println(nearTarget(nums , target));
    }
    //approach 1
    private static int nearTarget(int[] nums, int target){
        int ans = Integer.MAX_VALUE;
        int diff = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                for(int k = j+1 ; k < nums.length ; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(Math.abs(target - sum) < diff){
                        ans = sum;
                        diff = Math.abs(target - sum);
                    }
                }
            }
        }
        return ans;
    }
}
