//WEEK 1
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

/* program 6------------------------------------------------------------------------------------------------------------

public class DSA {
    public static String alternateStringCombiner(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());


            for (int i = 0; i < minLength; i++) {
                result.append(a.charAt(i));
                result.append(b.charAt(i));
            }

            // Append remaining characters from the longer string
            if (a.length() > minLength) {
                result.append(a.substring(minLength));   // result.append("Hello");
            }
            if (b.length() > minLength) {                 //result.insert(5, " World");,result.delete(5, 11);
                result.append(b.substring(minLength));
            }

            return result.toString();                     //toString(): Converts the StringBuilder to a String object.
        // This is useful when you need a string representation of the current StringBuilder content.
        }
    public static void main(String[]args){
        System.out.println(alternateStringCombiner("aasish","bunny"));
    }
}

*/
// program 7------------------------------------------------------------------------------------------------------------
/*import java.util.Scanner;
class  DSA{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements:");
        int n=sc.nextInt();
        int[]arr=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        for(int i=3;i<n+1;i++){
            arr[i]=arr[i-2]+arr[i-3];

        }
        for(int i=0;i<n+1;i++){
            System.out.println(arr[i]+" ");
        }

    }
}
// program 8------------------------------------------------------------------------------------------------------------


//import java.util.Scanner;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DSA {

    public static void main(String[] args) {
        int[] arr1 = {16, 17, 4, 3, 5, 2};
        int[] arr2 = {10, 4, 2, 4, 1};
        int[] arr3 = {5, 10, 20, 40};
        int[] arr4 = {30, 10, 10, 5};

        System.out.println("Leaders: " + findLeaders(arr1));
        System.out.println("Leaders: " + findLeaders(arr2));
        System.out.println("Leaders: " + findLeaders(arr3));
        System.out.println("Leaders: " + findLeaders(arr4));
    }

    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();

        if (arr == null || arr.length == 0) {
            return leaders; // Return empty list if the array is null or empty
        }

        int n = arr.length;
        int maxFromRight = arr[n - 1]; // The last element is always a leader
        leaders.add(maxFromRight);

        // Traverse the array from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(maxFromRight);
            }
        }

        // Reverse the list to maintain the order of leaders as in the array
        Collections.reverse(leaders);
        return leaders;
    }
}
*/
/*//program 9----------------------------------------------------------------------------------------------------------
class DSA {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rev=0;
        int dig=N%10;
        rev=rev*10+dig;
        dig=N/10;

        long res=(long)Math.pow(N,rev);
        System.out.println(res);


    }
}
import java.util.Scanner;

public class DSA {
    // Function to calculate (base^exp) % mod using modular exponentiation
    public static long modularExponentiation(long base, long exp, long mod) {
        long result = 1;
        base = base % mod; // Handle base greater than mod
        while (exp > 0) {
            if ((exp % 2) == 1) { // If exp is odd
                result = (result * base) % mod;
            }
            exp = exp >> 1; // exp = exp / 2
            base = (base * base) % mod; // base = base * base
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close(); // Close the scanner

        // Compute the reverse of the number N
        int originalN = N;
        int rev = 0;
        while (N > 0) {
            int digit = N % 10;
            rev = rev * 10 + digit;
            N = N / 10;
        }

        // Define the modulo value
        long MOD = 1000000007L;

        // Calculate (originalN^rev) % MOD
        long result = modularExponentiation(originalN, rev, MOD);

        // Print the result
        System.out.println(result);
    }
}
/

 */
// program 10-------------------------------------------------------------------------------------------------------
//import java.util.Scanner;

/*class DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elemnts of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double mean = findMean(arr, 0, n);
        System.out.println("the mean of the array:" + mean);


    }
        public static double findMean(int[]arr,int start,int end){
        if (start>=end){
            return 0;
        }
        else{
            int sum = arr[start] + (int) (findMean(arr, start + 1, end) * (end - start - 1));
            return sum / (double) (end - start);
         }
        }
}
*/

//-------------------------------------------------------------------------------------------------------------------------
//week 2
// linear search

/*import java.util.Scanner;

class DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        int a[] = new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == target) {
                System.out.println("search done");
                break;
            }

            }
        }
    }


*/
// week 2--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// BINARY SEARCH
/*public class DSA {

    // Function to perform binary search
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;


            if (arr[mid] == key) {
                return mid;
            }


            if (arr[mid] < key) {
                left = mid + 1;
            } else {

                right = mid - 1;
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int key = 10;

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}*/
//---------------------------------------------------------------------------------------------------------------------------------
// uniform binary Search
/*import java.util.Scanner;
class DSA{
    static int Linear(int a ,int b,int[] arr){
        if (a<0){
            return -1;
        }
        else if (arr[a]==b){
            return a;
        }
        else{
            return Linear(a-1,b,arr);
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            arr[i]=s;
        }
        int b=sc.nextInt();
        System.out.print(Linear(n-1,b,arr));
    }
}

*/
// interpolation Search----------------------------------------------------------------------------------------------------------

/*import java.util.*;
class DSA{
    static int Linear(int a ,int b,int[] arr){
        if (a<0){
            return -1;
        }
        else if (arr[a]==b){
            return a;
        }
        else{
            return Linear(a-1,b,arr);
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            arr[i]=s;
        }
        int b=sc.nextInt();
        System.out.print(Linear(n-1,b,arr));
    }
}

*/
//Fibonacci Search-------------------------------------------------------------------------------------------------------------------
/*import java.util.*;
class DSA{
    static int Linear(int a ,int b,int[] arr){
        if (a<0){
            return -1;
        }
        else if (arr[a]==b){
            return a;
        }
        else{
            return Linear(a-1,b,arr);
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int s=sc.nextInt();
            arr[i]=s;
        }
        int b=sc.nextInt();
        System.out.print(Linear(n-1,b,arr));
    }
}*/

// week 3-----------------------------------------------------------------------------------------------------------------------
// bubble sort
/*import java.util.Scanner;
import java.util.Arrays;
class DSA{
    public static void main(String[] args){
        int temp;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0; i<n-1; i++)
        {
            boolean swapped = false;
            for(int j=0; j<n-1-i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        for(int i=0; i<n; i++)
        {
            System.out.print((arr[i]));
            if(n-1>i)
            {
                System.out.print(", ");
            }
        }
    }
}*/
// selection sort -------------------------------------------------------------------------------------------------------------------------
/*import java.util.Scanner;
import java.util.Arrays;

public class DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j+1] < arr[j]) {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (!swap) break;
        }
        for (int i = 0; i < n; i++) {
            System.out.print((arr[i]));
            if (n - 1 > i) {
                System.out.print(", ");
            }
        }
    }
}

 */
//insertion sort ----------------------------------------------------------------------------------------------------------------------
/*import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class DSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

        }
        for (int k = 0; k < n; k++) {
            System.out.print((arr[k]));
            if (k<n-1) {
                System.out.print(", ");
            }
        }

    }
}*/
// week 4-----------------------------------------------------------------------------------------------------------------------------
//quick sort
import java.util.Stack;
import java.util.Arrays;
import java.util.Scanner;

public class DSA {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    public static void quickSortIterative(int[] arr, int low, int high) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] { low, high });

        while (!stack.isEmpty()) {
            int[] range = stack.pop();
            low = range[0];
            high = range[1];

            if (low < high) {
                int pivotIndex = partition(arr, low, high);

                // Push sub-arrays to be sorted
                stack.push(new int[] { low, pivotIndex - 1 });
                stack.push(new int[] { pivotIndex + 1, high });
            }
        }
    }

    // Main method to test quick sort
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the list");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements of the array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        quickSortIterative(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}