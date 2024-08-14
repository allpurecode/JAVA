import java.util.Scanner;

public class Buttefly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int gap = 2 * n - 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j <= i) {
                    System.out.print("$");
                } else if (j <= gap+i) {
                    System.out.print(" ");
                } else {
                    System.out.print("$");
                }


            }
            gap = gap - 2;
            System.out.println();

        }
        gap+=2;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < 2 * n; j++) {
                if (j < i-1) {
                    System.out.print("$");
                }
                else if (j <= gap+i) {
                    System.out.print(" ");
                } else if(j>=gap+i)  {
                    System.out.print("$");
                }


            }
            gap = gap + 2;
            System.out.println();

        }

    }
}

