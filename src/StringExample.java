import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String str[] = s1.split(" ");
        String fun = str[0];
        int value = Integer.parseInt(str[1]);
        switch (fun) {
            case "sin":
                System.out.println(Math.sin(value));
                break;
            case "cos":
                System.out.println(Math.cos(value));
                break;
            case "tan":
                System.out.println(Math.tan(value));
                break;
            case "cot":
                System.out.println(1 / Math.tan(value));
                break;
            case "sec":
                System.out.println(1 / Math.cos(value));
                break;
            case "cosec":
                System.out.println(1 / Math.sin(value));
                break;

        }


    }
}
