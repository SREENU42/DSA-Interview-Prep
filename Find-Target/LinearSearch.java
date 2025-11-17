//find Target Using LinearSearch

class LinearSearch{
    public static void main (String[] args) {
        int [] arr={10,6,9,3,7};
        int target=9;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Target is found at :"+i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Not Fount ");
        }
    }
}