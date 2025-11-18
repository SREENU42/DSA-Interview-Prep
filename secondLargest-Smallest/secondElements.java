public class secondElements {
    public static void main(String[] args) {
        int[] nums = {12, 5, 9, 21, 21, 7};
        Integer first = null, second = null;
        Integer smallest = null, secondSmallest = null;

        for (int n : nums) {
            
            if (first == null || n > first) {
                second = first;
                first = n;
            } else if ((second == null || n > second) && n != first) {
                second = n;
            }
           
            if (smallest == null || n < smallest) {
                secondSmallest = smallest;
                smallest = n;
            } else if ((secondSmallest == null || n < secondSmallest) && n != smallest) {
                secondSmallest = n;
            }
        }

        System.out.println("Second largest: " + (second != null ? second : "No distinct second largest value."));
        System.out.println("Second smallest: " + (secondSmallest != null ? secondSmallest : "No distinct second smallest value."));
    }
}