import java.util.Scanner;

public class Camel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        int count=0;
        for (int i = 0; i < s1.length() ; i++) {
            if (s1.substring(i, i + 1).equals(s1.substring(i, i + 1).toUpperCase())) {
                count++;
            }
        }
        System.out.println(count+1);
    }
}
