/*
Maximum Subarray 문제 코드

 */
 */


public int maxSubArray(int[] nums) {
        int[] arr = new int[nums.length];
        int ret = nums[0];
        arr[0] = nums[0];

        for (int i = 1; i< nums.length; i++) {
            if (nums[i] < nums[i] + arr[i-1]) {
                arr[i] = nums[i] + arr[i-1];
            } else {
                arr[i] = nums[i];
            }

            if (ret < arr[i]) {
                ret = arr[i];
            }
        }
        return ret;
}