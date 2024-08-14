import java.util.Scanner;

public class ooppsss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 2 * n + 1; j++) {
                if (j <= n - i - 1) {
                    System.out.print("  ");
                } else if (j > n + i) {
                    System.out.print("  ");
                } else System.out.print("# ");
            }
            System.out.println();
        }
    }
}




