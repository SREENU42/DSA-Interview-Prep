//Missing Number Using Cyclic Sort

class MissingNum {

    public static void main(String[] args) {

        int arr[] = {4, 2, 3, 6, 1};
        int n = 6;

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                System.out.println("Missing Number = " + (index + 1));
                return;
            }
        }
        System.out.println("Missing Number="+n);
    }
}
