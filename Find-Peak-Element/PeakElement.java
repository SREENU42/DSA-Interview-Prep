class PeakElement {
    public static int findPeakElement(int[] nums) {

        int n = nums.length;

        
        if (n == 1) return 0;

        
        if (nums[0] > nums[1]) return 0;

       
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                return i;
            }
        }

        
        if (nums[n - 1] > nums[n - 2]) return n - 1;

        return -1; 
    }


    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element index = " + peakIndex);
    }
}
