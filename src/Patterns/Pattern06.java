package Patterns;

public class Pattern06 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i<n; i++){
            int flag = 1;
            for(int j = 0; j<=n-i-1; j++){
                System.out.print(flag + " ");
                flag++;
            }
            System.out.println();
        }
    }
}

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 */

