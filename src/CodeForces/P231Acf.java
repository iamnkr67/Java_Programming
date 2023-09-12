package CodeForces;
//Codeforces Problem - 231A
import java.util.Scanner;
public class P231Acf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of problems
        int n = sc.nextInt();
        sc.nextLine();

        // Initialize a variable to count the problems they will implement
        int count = 0;

        // Loop through each problem
        for (int i = 0; i < n; i++) {
            // Read the views of each friend for the current problem
            int petya = sc.nextInt();
            int vasya = sc.nextInt();
            int tonya = sc.nextInt();

            // Check if at least two of them are sure about the solution
            if (petya + vasya + tonya >= 2) {
                count++;
            }
        }

        // Print the number of problems they will implement
        System.out.println(count);

        sc.close();
    }
}

/*

**Problem Statement:**

Three friends, Petya, Vasya, and Tonya, are participating in a programming contest with n problems. They will implement a problem only if at least two of them are confident about the solution. Given the confidence levels of the friends for each problem, determine the number of problems they will implement.

**Input:**
- The number of problems in the contest (n).
- For each of the n problems:
  - Three integers (0 or 1) representing Petya's, Vasya's, and Tonya's confidence levels respectively.

**Output:**
- A single integer representing the number of problems the friends will implement.

**Example 1:**
- Input:
   3
   1 1 0
   1 1 1
   1 0 0
- Output: 2

- Explanation:
  - Problems 1 and 2 have at least two friends confident, so they will implement these problems.

**Example 2:**
- Input:
   2
   1 0 0
   0 1 1
- Output: 1

- Explanation:
  - Only problem 2 has at least two friends confident, so they will implement this problem.

 */

