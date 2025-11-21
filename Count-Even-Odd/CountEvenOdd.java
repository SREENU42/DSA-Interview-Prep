public class CountEvenOdd {
    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 9, 2};

        int even = 0;
        int odd = 0;

        for (int num : arr) {  
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
    }
}
