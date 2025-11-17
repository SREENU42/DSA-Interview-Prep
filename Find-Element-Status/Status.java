//Second largest & second smallest element

class Status{
    public static void main (String[] args) {
        int []arr={2,3,9,8,4,6,1};
        int smallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        
        for(int num:arr){
            if(num<smallest){
                secondSmallest=smallest;
                smallest=num;
            }else if(num<secondSmallest&&num!=smallest){
                secondSmallest=num;
            }
        }
        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num>secondLargest&&num!=largest){
                secondLargest=num;
            }
        }
        System.out.println("Smallest:"+smallest);
        System.out.println("secondSmallest:"+secondSmallest);
        
        System.out.println("Largest:"+largest);
        System.out.println("SecondLargest:"+secondLargest);
    }
}