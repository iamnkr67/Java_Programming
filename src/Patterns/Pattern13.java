package Patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print((char)(j+64));
                if(j<i)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*

n = 5;

A
A B
A B C
A B C D
A B C D E

 */