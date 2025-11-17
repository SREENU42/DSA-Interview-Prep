//Find first occurrence & last occurrence

class FirstAndLastOccurrence{
    public static void main (String[] args) {
        int []arr={4,5,8,4,3,9};
        int target=4;
        int first=-1;
        int last=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                first=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
            last =i;
            break;
            }
        }
        System.out.println("First Occurrence at index:"+first);
        System.out.println("Last occurrence is Index:"+last);
    }
}