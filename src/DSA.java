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
//------------------------------------------------------------------------------------------------------------------------------
// fibonacci search

import java.util.*;

/*class DSA {
    public static int fibonacciSearch(int[] arr, int x) {
        int n = arr.length;
        if (n == 0) {
            return -1;
        }

        // Initialize Fibonacci numbers
        int fib1 = 0, fib2 = 1, fib3 = fib1 + fib2;

        // Find the smallest Fibonacci number greater than or equal to n
        while (fib3 < n) {
            fib1 = fib2;
            fib2 = fib3;
            fib3 = fib1 + fib2;
        }

        // Initialize variables for the current and previous split points
        int offset = -1;
        while (fib3 > 1) {
            int i = Math.min(offset + fib2, n-1);

            // If x is greater than the value at index i, move the split point to the right
            if (arr[i] < x) {
                fib3 = fib2;
                fib2 = fib1;
                fib1 = fib3 - fib2;
                offset = i;
            }

            // If x is less than the value at index i, move the split point to the left
            else if (arr[i] > x) {
                fib3 = fib1;
                fib2 = fib2 - fib1;
                fib1 = fib3 - fib2;
            }

            // If x is equal to the value at index i, return the index
            else {
                return i;
            }
        }

        // If x is not found in the array, return -1
        if (fib2 == 1 && arr[offset+1] == x) {
            return offset + 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100, 235};
        int n = arr.length;
        int x = 235;
        int ind = fibonacciSearch(arr, x);
        if (ind >= 0) {
            System.out.println("Found at index: " + ind);
        } else {
            System.out.println(x + " isn't present in the array");
        }
    }
}
*/
// week 4-----------------------------------------------------------------------------------------------------------------------------
//quick sort
/*import java.util.Stack;
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
}*/
// MERGE SORT -------------------------------------------------------------------------------------------------------------------------
/*import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        // System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Input array elements
        // System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Perform Quick Sort
        quickSort(arr, 0, size - 1);

        // Output the sorted array
        // System.out.println("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }

        // Close the scanner
        scanner.close();
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pIndex = partition(arr, start, end);
            quickSort(arr, start, pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[end] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }
}*/
// HEAP SORT ------------------------------------------------------------------------------------
/*import java.util.Scanner;

public class DSA{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        // System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        // Input array elements
        // System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Perform Heap Sort
        heapSort(arr);

        // Output the sorted array
        // System.out.println("Sorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(" ");
            }
        }

        // Close the scanner
        scanner.close();
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // left = 2*i + 1
        int right = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger than largest so far
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
}*/
// RADIX SORT-----------------------------------------------------------------------------------------
/*import java.util.Arrays;
import java.util.Scanner;

class DSA {
    // A utility function to get maximum value in arr[]
    static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    // A function to do counting sort of arr[] according to the digit represented by exp.
    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);

        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        // Change count[i] so that count[i] now contains actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now contains sorted numbers according to current digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    // The main function to that sorts arr[] of size n using Radix Sort
    static void radixsort(int arr[], int n) {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);

        // Do counting sort for every digit. Note that instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    // A utility function to print an array
    static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    // Main driver method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter the number of elements:");
        int len = scanner.nextInt();  // Declare and initialize `len`
        scanner.nextLine(); // Consume the newline character

        // System.out.println("Enter the numbers separated by space:");
        String input = scanner.nextLine();

        // Split the input string by spaces
        String[] elements = input.split(" ");

        // Convert the string elements to integers
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(elements[i].trim());
        }
        int n = arr.length;

        // Function Call
        radixsort(arr, n);
        print(arr, n);
    }
}
// SHELL SORT ------------------------------------------------------------------------------
import java.util.Scanner;

class ShellSort {
    // Utility function to print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            if (i == n - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    // Function to sort arr using shellSort
    int sort(int arr[]) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];
                arr[j] = temp;
            }
        }
        return 0;
    }
}

public class DSA {
    // Utility function to print array of size n
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            if (i == n - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println();
    }

    // Driver method
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        // Get the length of the array
        int len = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Get the numbers separated by space
        String input = scanner.nextLine();

        // Split the input string by spaces
        String[] elements = input.split(" ");

        // Convert the string elements to integers
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(elements[i].trim());
        }

        ShellSort ob = new ShellSort();
        ob.sort(arr);

        printArray(arr);
    }
}*/
// week 5------------------------------------------------------------------------------------------------------------------------------------
// IMPLEMENTATION OF STACKS
/*class DSA {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor
    public DSA(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;  // Initialize the top to -1, indicating an empty stack
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value; // Increment top, then insert value
            System.out.println(value + " pushed to stack.");
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;  // Return -1 to indicate stack is empty
        } else {
            int poppedValue = stackArray[top--]; // Return the top value, then decrement top
            System.out.println(poppedValue + " popped from stack.");
            return poppedValue;
        }
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1; // Return -1 to indicate stack is empty
        } else {
            System.out.println("Top of stack: " + stackArray[top]);
            return stackArray[top];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }
}

class StackExample {
    public static void main(String[] args) {
        DSA stack = new DSA(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pop(); // 30 should be popped
        stack.peek(); // 20 should be at the top

        stack.push(40);
        stack.push(50);
        stack.push(60); // Should display stack is full

        stack.pop(); // 50 should be popped
        stack.pop(); // 40 should be popped
    }
}
*/
// BLANCED PARENTHESE---------------------------------------------------------------------------------------------------------
/*import java.util.Stack;

class BalancedParenthesisChecker {
    // Method to check if parentheses are balanced
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char current = expression.charAt(i);

            // Push open parentheses onto the stack
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            }
            // If it's a closing parenthesis, check the top of the stack
            else if (current == ')' || current == '}' || current == ']') {
                // If stack is empty, it means there's no corresponding opening parenthesis
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                // Check if the current closing parenthesis matches the last open one
                if ((current == ')' && top != '(') ||
                        (current == '}' && top != '{') ||
                        (current == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all parentheses were matched; otherwise, they are unbalanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "{()()}";
        String expression2 = "{()[)}";

        System.out.println(expression1 + " : " + isBalanced(expression1));  // true
        System.out.println(expression2 + " : " + isBalanced(expression2));  // false
    }
}*/
// EVALUATION OF POSTFIX EXPRESSION ---------------------------------------------------------------------------------------------------------
import java.util.Stack;
import java.util.Stack;

public class DSA {

    // Method to evaluate a postfix expression
    public static int evaluatePostfix(String expression) {
        // Create a stack to store operands
        Stack<Integer> stack = new Stack<>();

        // Traverse through every character in the postfix expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the character is a digit, push it onto the stack
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert char to int
            }
            // Otherwise, the character is an operator
            else {
                // Pop two operands from the stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                // Perform the operation and push the result back to the stack
                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }
            }
        }

        // The result is the last element remaining in the stack
        return stack.pop();
    }

    // Main method for testing
    public static void main(String[] args) {
        String postfix = "53+62/*35*+";
        int result = evaluatePostfix(postfix);
        System.out.println("The result of the postfix expression is: " + result);
    }

}

//--------------------------------------------------------------------------------------------------------------------------------
import java.util.Stack;

public class InfixToPostfix {

    // Function to check if the character is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    // Function to get precedence of an operator
    private static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    // Function to convert infix expression to postfix expression
    public static String infixToPostfix(String expression) {
        // Stack for operators and parentheses
        Stack<Character> stack = new Stack<>();
        // StringBuilder for storing the postfix expression
        StringBuilder postfix = new StringBuilder();

        // Traverse the infix expression character by character
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is an operand, add it to the output
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
            // If the character is a left parenthesis, push it to the stack
            else if (ch == '(') {
                stack.push(ch);
            }
            // If the character is a right parenthesis, pop until left parenthesis is found
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remove '(' from the stack
            }
            // If the character is an operator
            else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop the remaining operators from the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        String infixExpr = "a+b*(c^d-e)^(f+g*h)-i";  // Example infix expression
        String postfixExpr = infixToPostfix(infixExpr);
        System.out.println("Postfix Expression: " + postfixExpr);
    }
}
// REVERSE STACK --------------------------------------------------------------------------------------------


public class DSA {
    public static void reverseStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        // Transfer all elements from the original stack to the temporary stack
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }

        // Now transfer back the elements to the original stack, which reverses the order
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
         Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);
        reverseStack(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}

