class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int MaxCount = 0;
        for(int i=0; i<nums.length;  i++){
            if(nums[i]==1){
                count +=1;
            }
            else{
                MaxCount = Math.max(MaxCount, count);
                count =0;
            }
        }
        return Math.max(MaxCount, count);
        
    }
}
