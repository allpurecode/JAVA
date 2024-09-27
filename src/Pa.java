
import java.util.Scanner;
public class Pa {


        // Recursive function similar to the C code
        public static int fun(int n) {
            int x = 1; // Start with x = 1
            if (n == 1) { // Base case: if n == 1, return 1
                return x;
            }
            // Loop from 1 to n-1, recursively calculate and add to x
            for (int k = 1; k < n; ++k) {
                x = x + fun(k) * fun(n - k);
            }
            return x; // Return the final result
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            // Example input
            System.out.println( fun(n));
        }
    }
