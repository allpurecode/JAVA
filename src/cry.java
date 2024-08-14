import java.util.Scanner;

public class cry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine().toLowerCase();
        int shift=sc.nextInt();
        char[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '};
        for (int i = 0; i <input.length() ; i++) {
            System.out.print((char) (input.charAt(i)+(shift)));


        }
    }
}
