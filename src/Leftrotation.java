import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/*public class Leftrotation {
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
    }*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Solution {
    public int romanToInt(String s) {
        Map <Character,Integer> romanVal=new HashMap<>();
        romanVal.put('I', 1);
        romanVal.put('V', 5);
        romanVal.put('X', 10);
        romanVal.put('L', 50);
        romanVal.put('C', 100);
        romanVal.put('D', 500);
        romanVal.put('M', 1000);

        int  result=0;
        for(int i=s.length()-1;i>=0;i--){
            int currValue = romanVal.get(s.charAt(i));

            if (i < s.length() - 1 && currValue < romanVal.get(s.charAt(i + 1))) {
                result -= currValue;
            } else {
                result += currValue;
            }
        }

        return result;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        Solution obj=new Solution();
        System.out.println(obj.romanToInt(s));
    }
}

