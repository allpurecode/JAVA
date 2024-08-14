import java.util.Scanner;

public class Weighted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String input = sc.nextLine().toLowerCase();
        int sum=0;
        for (int i = 0; i <input.length() ; i++) {
            for (int j = 0; j <alpha.length ; j++) {
                if(alpha[j]==input.charAt(i)){
                    sum=sum+j+1;
                }
            }



        }
        System.out.println(sum);
    }
}
