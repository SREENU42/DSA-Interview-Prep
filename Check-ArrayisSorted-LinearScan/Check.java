//Find Check Array is Sorted or Not in Ascending Order Using Linear Scan

public class Check{
    public static void main (String[] args) {
        int arr[]={10,3,8,3,4,5,9};
        
        int left=arr[0];
        int right=arr.length;
        
        for(int i=0;i<arr.length;i++){
            if(left>right){
                System.out.println("Array is not Sorted in AscendingOrder");
                break;
            }else{
                System.out.println("Array is Sorted");
            }
        }
    }
}
