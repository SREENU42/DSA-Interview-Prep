//Find Maximum Element In An Array using LinearSearch


class MaximumElement{
    public static void main (String[] args) {
        int arr[]={10,99,7,33,4,55,67};
        
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Maximum Element in This Array is :"+max);
    }
}