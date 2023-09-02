package Array;

import java.util.Scanner;

public class RotateAList {

    //swapping an array passed by swapArray();
    public static void swapArray(int[] arr, int size){
        for(int i = 0; i<size-1; i++){
            int temp = arr[i];
                arr[i]  = arr[i+1];
                arr[i+1] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of test cases : ");
        int t = sc.nextInt();

        while(t!=0){
            System.out.print("Enter size of an array : ");
            int size = sc.nextInt();

            System.out.print("Enter array of given size " + size + " : ");
            int[] arr = new int[size];

            for(int i = 0; i<size; i++)
                 arr[i] = sc.nextInt();

            System.out.print("Enter no. of rotation : ");
            int r = sc.nextInt();


            //when rotation value is more than the size of an array
            if(r>size) {
                 r = r  - size;
            }
            int count = 0;

            //rotation
            for(int i = 0; i<size; i++){
                swapArray(arr,size);

                count++;
                if(count == r )
                       break;
            }
            t--;

            //printing the rotated array
            for(int number : arr){
                System.out.print(number + " ");
            }
        }
    }
}
