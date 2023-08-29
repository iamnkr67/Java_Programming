package Array;

public class KadaneAlgo {
    public static  int getMaxSum(int[] numbers){
        int cs = 0;
        int ms = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
            cs += numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        return ms;
    }
    public static void main(String[] args) {
        int[] numbers = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Max Sum = " + getMaxSum(numbers));
    }
}




/*

Kadane's Algorithm [ time complexity = O(n) ]
----------------------------------
     +ve  +   +ve  = +ve  (favourable situation)
     +ve  +   -ve(small negative)  = +ve (fav. situation)
     +ve(small positive) +   -ve(big negative)  = -ve (unfavourable situation) if happens make it "zero"
----------------------------------

 */