public boolean noTriples(int[] nums) {
    for (int i=0; i < (nums.length-2); i++) {
        int a = nums[i];
        if (nums[i+1]==a && nums[i+2]==a) return false;
    }

    return true;
}
