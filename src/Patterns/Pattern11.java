package Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int new_n;

        for(int i = 0; i<n; i++){
            int flag = 1;
            //pattern
            for(int j = 0; j<=i; j++){
                System.out.print(flag);
                flag +=1;
            }

            //space
            new_n = (2*n) - (2*flag) + 2;


            for(int k = 0; k<new_n; k++){
                System.out.print(" ");
            }
            //pattern
            for(int j = 0; j<=i; j++){
                flag -= 1;
                System.out.print(flag);
            }
            System.out.println();
        }
    }
}

/*
when n = 5;

1        1
12      21
123    321
1234  4321
1234554321

 */
