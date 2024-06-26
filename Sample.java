// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : no
// Any problem you faced while coding this : yes


// Your code here along with comments explaining your approach


Please help this code is not working in leetcode
class Solution {
    private static int findLowestCoins(int[] coins, int amount) {
        int n = coins.length - 1;
        int ans = 0;
        for (int i=n;i>=0;i--){
            if (amount>= coins[i]){
                ans += amount/coins[i];
                amount = amount%coins[i];
            }
        }
        if (amount == 0)
            return ans;
        else
            return -1;
    }
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);

        return  findLowestCoins(coins, amount); 
    }
}


// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public int rob(int[] nums) {

        int incl = nums[0], excl = 0, excl_new;
        for (int i=1;i<nums.length;i++){
            excl_new = Math.max(incl, excl);
            incl = excl + nums[i];
            excl = excl_new;
        }

        return excl>incl? excl: incl;
    }
}