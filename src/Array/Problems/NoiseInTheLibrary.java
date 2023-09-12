package Array.Problems;

import java.util.Scanner;

public class NoiseInTheLibrary {

    public static int binarySearch(int n, int[] book_IDs, int value){
        int l = 0;
        int r = n - 1;
        int c = -1;

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(book_IDs[mid] == value){
                c = mid;
                break;
            }
            else if(book_IDs[mid] > value){
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return c;
    }

    public static long totalNoise(int N, int book_IDs[], int K, int booksToFind[]) {
        long totalNoise = 0;

        for(int i = 0; i < K; i++){
            int bookToFind = booksToFind[i];
            int index = binarySearch(N, book_IDs, bookToFind);

            if(index == -1){
                totalNoise += N;
            }
            else {
                totalNoise += index;
            }
        }

        return totalNoise;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books : ");
        int N = sc.nextInt();
        int[] book_IDs = new int[N];
        System.out.print("Enter book IDs in decreasing order : ");
        for(int i = 0; i < N; i++){
            book_IDs[i] = sc.nextInt();
        }

        System.out.print("Enter number of books to find : ");
        int K = sc.nextInt();
        System.out.print("Enter book IDs for the books to be searched : ");
        int[] booksToFind = new int[K];
        for(int i = 0; i < K; i++){
            booksToFind[i] = sc.nextInt();
        }

        System.out.print("Total Noise that is generated to reach K given books is : " + totalNoise(N, book_IDs, K, booksToFind));
    }
}
