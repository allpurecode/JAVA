import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Leftrotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
             arr[i]=sc.nextInt();
        }
        int constant=arr[0];
        for (int i = 0; i <4; i++) {
            arr[i]=arr[i+1];

        }
        arr[4]=constant;
        System.out.print(Arrays.toString(arr));



    }
    }