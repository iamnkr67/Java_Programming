package Patterns;

import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a number : ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){ //outer loop
            for(int j = 0; j<=i; j++)  // inner loop
                System.out.print("*" + " ");
            System.out.println();
        }

    }
}
/*
Enter  a number : 5
*
* *
* * *
* * * *
* * * * *
 */