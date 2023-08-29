package Patterns;

import java.util.Scanner;

public class Pattern07 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i<n; i++){

            //space
            for(int j = 1; j<=n-i-1; j++ )
                System.out.print(" ");

            //pattern
            for(int k = 0; k<2*i+1; k++)
                System.out.print("*");

            //space
            for(int j = 1; j<=n-i-1; j++ )
                System.out.print(" ");

            System.out.println();
        }
    }
}

/*

    *
   ***
  *****
 *******
*********

 */