package Array;

public class MaxSubArraySum {
    public static int getMaxsubarraysum(int[] numbers){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i<numbers.length; i++){
             for(int j = i; j<numbers.length; j++){
                 currSum = 0;
                for(int k = i; k<= j; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum)
                    maxSum = currSum;
            }
        }
       return maxSum;
    }
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        System.out.println("Max sum is : " + getMaxsubarraysum(numbers)) ;
    }
}
