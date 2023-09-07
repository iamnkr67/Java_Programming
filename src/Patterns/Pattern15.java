package Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 4;
        int flag = n;
        int l = 0;

        for(int i = 0; i< (2*n) - 1; i++){
            for(int j = 0; j<(2*n)-1; j++){
                if(i == 0 || j == 0 || i == (2*n)-2 || j == (2*n)-2 ){
                    System.out.print(flag + " ");
                }
                else {
                    l++;
                    flag--;
                    for(int k = 1; k<(2*n)-1-l; k++){
                        System.out.print(flag + " ");
                    }
                }

            }
            System.out.println();
        }

    }
}

/*
 input : n = 4

  4 4 4 4 4 4 4
  4 3 3 3 3 3 4
  4 3 2 2 2 3 4
  4 3 2 1 2 3 4
  4 3 2 2 2 3 4
  4 3 3 3 3 3 4
  4 4 4 4 4 4 4

 */