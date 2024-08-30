import java.security.interfaces.DSAKey;
import java.util.Scanner;
//program 1-------------------------------------------------------------------------------------------------------------
/*public class DSA {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int l1= Math.abs(n1%10);
        int l2= Math.abs(n2%10);
        int sum =l1+l2;
        System.out.println(sum);
    }

}*/
// program 2-----------------------------------------------------------------------------------------------------------

import java.util.Scanner;
/*public class DSA {


        int ExactMultiple ( int n, int m) {
            if (n == 0 | m == 0) {
                return 3;
            } else if (n % m == 0 | m % n == 0) {
                return 2;
            } else {
                return 1;
            }
        }
        public static void main (String[] args){
        DSA a= new DSA();
        System.out.println(a.ExactMultiple(5,10));
        }
}*/


//program 3------------------------------------------------------------------------------------------------------------

/*public class DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.length()<b.length()){
            System.out.println(a+b+a);
        }
        else if (a.length()>b.length()){
            System.out.println(b+a+b);
        }

    }
}*/

// program 4-----------------------------------------------------------------------------------------------------------
/*public class DSA {

    public static int countNumbers(int num1, int num2, int num3, int num4, int num5, String type) {
      int[] numbers = {num1, num2, num3, num4, num5};
        int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }


        if (type.equals("even")) {
            return evenCount;
        } else if (type.equals("odd")) {
            return oddCount;
        }
    }

    public static void main(String[] args) {
       System.out.println(countNumbers(12, 17, 19, 14, 115, "odd"));  // Output: 3
       System.out.println(countNumbers(12, 17, 19, 14, 115, "even")); // Output: 2
    }
}*/

//program 5 ---------------------------------------------------------------------------------------------------------
/*public class DSA {
    public static int getSecondLastDigit(int number){
       int Digit=number/10;
       int lastDigit=Digit%10;
        return lastDigit;
    }
public static void main(String[]args){

        System.out.println(getSecondLastDigit(1234));

}
}*/

// program 6------------------------------------------------------------------------------------------------------------

public class DSA {
    Scanner sc = new Scanner(System.in);
    String S1 = sc.nextLine();
    String S2 = sc.nextLine();
    StringBuilder mergedString = new StringBuilder();
    int length1 = S1.length();
    int length2 = S2.length();
    int maxLength = Math.max(length1, length2);
}
