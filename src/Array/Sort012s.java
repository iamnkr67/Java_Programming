package Array;

public class Sort012s {
    public static void getSort(int[] arr){
        int i = 0;
        int f0 = 0;
        int f2 = arr.length - 1;

        while(i<=f2){

            if(arr[i] == 0){
                arr[i] = arr[f0];
                arr[f0] = 0;
                f0++;
                i++;
            }

            else if(arr[i] == 2){
                arr[i] = arr[f2];
                arr[f2] = 2;
                f2--;
            }

            else  i++;
        }
    }
    public static void main(String[] args) {
        int[] numbers = {0,1,0,2,0,1,1,0,1,1,1,0,0,1,2,0,1,2};
        getSort(numbers);

        for(int i = 0; i<numbers.length; i++)
            System.out.print(numbers[i] + " ");
    }
}
