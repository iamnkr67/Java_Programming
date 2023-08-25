package Array;

public class SubArray {
    public static  void printSubArrays(int[] numbers){
        int ts = 0;
        for(int i = 0; i<numbers.length; i++){
            for(int j = i; j<numbers.length; j++){
                for(int k = i; k<= j; k++){                //print
                    System.out.print(numbers[k]+ " ");    //sub-array
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total sub-arrays = " + ts);   // total sub-array
    }
    public static void main(String[] args) {
        int[] numbers = {1,-2,6,-1,3};
        printSubArrays(numbers);
    }
}
