package Patterns;

import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        int flag = 1;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(flag + " ");
            }
            flag++;
            System.out.println();
        }
    }
}

/*
Enter a number : 5
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */