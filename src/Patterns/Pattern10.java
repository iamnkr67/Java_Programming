package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            int flag = i % 2; // Initialize flag to 0 for odd rows and 1 for even rows
            for (int j = 1; j <= i; j++) {
                System.out.print(flag + " ");
                flag = 1 - flag; // Toggle flag between 0 and 1
            }
            System.out.println(); // Move to the next row
        }
    }
}
/*

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

 */

