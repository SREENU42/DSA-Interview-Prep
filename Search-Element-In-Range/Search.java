// Search in range

public class Search{
    public static void main (String[] args) {
        int arr[]={10,3,5,8,6,14,16};
        
        int target=6;
        int start=2;
        int end=4;
        boolean found=false;
        
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                System.out.println("Target Is Found at index: "+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Target IS Not Found In The Range..");
        }
    }
}