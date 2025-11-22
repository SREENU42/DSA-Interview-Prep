import java.util.*;

public class MaxFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 3, 2, 4};

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0;
        int maxElement = arr[0];

        for (int num : arr) {   
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > maxFreq) {
                maxFreq = map.get(num);
                maxElement = num;
            }
        }

        System.out.println("Element with Maximum Frequency: " + maxElement);
        System.out.println("Frequency: " + maxFreq);
    }
}
