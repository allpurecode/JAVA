import java.util.Scanner;

public class Elimination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine());
        while (true) {
            int originalString = input.length();
            for (int i = 0; i < input.length() - 1; i++) {
                if (input.charAt(i) == input.charAt(i + 1)) {
                    input.replace(i, i + 2, "");
                    i--;
                }
            }
            if (input.length() == originalString || input.isEmpty())
                break;
            else originalString = input.length();
        }
        System.out.println(input.isEmpty() ? "Empty String" : input);
    }
}



