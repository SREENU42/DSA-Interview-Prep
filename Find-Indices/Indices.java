// Find all indices of target

public class Indices{
    public static void main (String[] args) {
        int []arr={4,2,6,8,4,3,5,4};
        
        int target=4;
        boolean found=false;
        
        System.out.print("Indices: ");
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print(i+" ");
                found=true;
            }
        }
        if(!found){
            System.out.println("Not Found");
        }
    }
}