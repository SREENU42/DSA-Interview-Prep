//find CountOccurrences Using LinearSearch

class CountOccurrences{
    public static void main(String[] args) {
        int arr[]={10,4,9,0,9};

        int target=9;
        int count=0;

        for(int num:arr){
            if(num==target){
                count++;
            }
        }
        System.out.println("Number " + target + " appears " + count + " times.");
    }
}