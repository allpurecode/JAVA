import java.util.Scanner;

public class additionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*  int sum = 0;*/
        int count = 0;
        String s1 = sc.nextLine().toUpperCase();
        char[] s2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',' '};
        s1 = s1.replaceAll("(.)(?=.*\\1)", "");
        System.out.println(s1);
      /*  int[] arr = new int[5];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
            sum = sum + arr[i];
        }
        System.out.println(sum);*/
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1.charAt(i) == s2[j]) {
                    count++;
                }
            }


        }
        System.out.println(count);
        System.out.println(count==27?"pangram":"not a pangram");
    }
}










