import java.util.Scanner;
import java.util.Arrays;
public class ArraySum{
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size= sc.nextInt();
        int[] numbers= new int[size];
        System.out.println("Enter "+size+"numbers");
        for (int i =0; i<size; i++) numbers[i]= sc.nextInt();
        System.out.println("enter array element: "+Arrays.toString(numbers));
        int sum=0;
        for (int num:numbers)sum+=num;
        System.out.println("Sum of array elements:" +sum);
        sc.close();

    }

}
