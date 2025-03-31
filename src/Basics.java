import java.util.Arrays;
import java.util.Scanner;

// Second largest_element (sort approach)------------------------------------------------------------------------------------------
/*public class Basics {
    public int SecondLargest(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);

        for(int i=n-2;i>=0;i--){
            if (arr[i]!=arr[n-1]){
                return arr[i];
            }

        }

        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        Basics obj = new Basics();
        System.out.println(obj.SecondLargest(arr1));
    }
}*/


// Second largest_element (Two pass approach)------------------------------------------------------------------------------------------
/*class Basics{

    public int SecondLargest_twopass(int arr[]){
        int largest=-1;
        int Secondlargest=-1;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if( arr[i]>largest){
            largest=arr[i];}
        }
        for(int i=0;i<n;i++){
            if (arr[i]>Secondlargest && arr[i]!=largest){
                Secondlargest=arr[i];

            }

        }
        return Secondlargest;

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        Basics obj = new Basics();
        System.out.println(obj.SecondLargest_twopass(arr1));
    }

}
*/
// Second largest_one pass-------------------------------------------------------------------------------------------------------------------------------------------
class Basics{
    public int getSecondLast_onepass(int arr[]){
        int n=arr.length;
        int largest=-1,secondLargest=-1;

        for(int i=0;i<n;i++){

            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }

            else if(arr[i]<largest&& arr[i]>secondLargest){
                secondLargest=arr[i];
            }

        }
        return secondLargest;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr1[] = new int[size];
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }

        Basics obj = new Basics();
        System.out.println(obj.getSecondLast_onepass(arr1));
    }
}