import java.util.Scanner;

public class Mars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String received = sc.nextLine();
        int count = 0;
        int number = received.length() / 3;
        String original = "";
        for (int i = 0; i < number; i++) {
            original = original + "SOS";
        }
        System.out.println(original);
        for (int i = 0; i < received.length(); i++) {
            if (received.charAt(i) != original.charAt(i)) {
                count++;
            }

        }
        System.out.println(count);

    }


}

