// Find the Minimum Element In an Array Using LinearSearch
class MinElement{
    public static void main (String[] args) {
        int []arr={10,9,8,5,7,4,30};
        
        int min=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum Element in the Array:"+min);
    }
}