/*//Reinprep-----------------------------------------------------------------------------------------------------------------
// week1
/*import java.util.Scanner;
public class Main1{
    int addLastDigit(int input1,int input2){
        int a=Math.abs(input1%10);
        int b=Math.abs(input2%10);
        int sum=a+b;
        return sum;
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        sc.useDelimiter("[\\s,]+");
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        Main1 obj=new Main1();
        System.out.println(obj.addLastDigit(input1,input2));
    }
}*/
/*//program 2--------------------------------------------------------------------------------------------------------------------------------
import java.util.Scanner;
class Main1{
    int ExactMultiple ( int num1, int num2) {
        if (num1 == 0 | num2 == 0) {
            return 3;
        } else if (num1 % num2== 0 | num1 % num2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }
    public static void main (String[] args){
        Main1 a= new Main1();
        Scanner sc=new Scanner(System.in);
        sc.useDelimiter("[\\s,]+");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        System.out.println(a.ExactMultiple(num1,num2));
    }
}*/
//----------------------------------------------------------------------------------------------------------------------------------------
/*import java.util.Scanner;

import java.util.Scanner;

class Main1 {
    int getSecondLastDigit(int number) {
        if (number <= 10) {
            return -1;
        } else {

            int Digit = number / 10;
            int lastDigit = Digit % 10;
            return lastDigit;
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            Main1 a = new Main1();

            System.out.println(a.getSecondLastDigit(number));

        }
    }

import java.util.Scanner;

public class Main1 {
    public static String alternateStringCombiner(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());

        // Alternating characters from both strings
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }


        if (a.length() > minLength) {
            result.append(a.substring(minLength));
        }
        if (b.length() > minLength) {
            result.append(b.substring(minLength));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        String a = String


        System.out.println(alternateStringCombiner(a, b));
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        // The rightmost element is always a leader
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

        // Traverse the array from second last element to the start
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Print the leaders in reverse order
        System.out.println("Leaders in the array: ");
        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] arr = new int[n];

        // Read the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Find and print leaders in the array
        findLeaders(arr);

        // Close the scanner
        scanner.close();
    }
}*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static List<Integer> findArrayLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int size = arr.length;

        int maxFromRight = arr[size - 1];
        leaders.add(maxFromRight);

        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        return leaders;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        // System.out.print("Enter the elements of the array separated by commas: ");
        String input = sc.nextLine();
        String[] inputArray = input.split(", ");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputArray[i].trim());
        }

        List<Integer> result = findArrayLeaders(arr);

        // System.out.print("Leaders in the array: ");
        for (int i = result.size() - 1; i >= 0; i--) {
            System.out.print(result.get(i) + " ");
        }
    }
}