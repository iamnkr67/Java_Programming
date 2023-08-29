package Patterns;

import java.util.Scanner;

public class Pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            int flag = 1;
            for(int j = 0; j<=i; j++){
                System.out.print(flag + " ");
                flag++;
            }
            System.out.println();
        }
    }
}
/*
Enter a number : 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */