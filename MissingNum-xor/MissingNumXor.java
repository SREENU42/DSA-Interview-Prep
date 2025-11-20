//Missing Number Using Xor

class MissingNumXor {
    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 5, 6};
        int n = 6;

        int xor1 = 0, xor2 = 0;

        for (int i = 1; i <= n; i++) {
            xor1 ^= i;
        }

        for (int num : arr) {
            xor2 ^= num;
        }

        int missing = xor1 ^ xor2;
        System.out.println("Missing Number = " + missing);
    }
}