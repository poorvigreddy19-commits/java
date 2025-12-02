
import java.util.Arrays;
import java.util.Scanner;
public class java_program {
    public static void main(String[] args){
        System.out.println("First java program");
        System.out.println("Hello java");
        System.out.println("Java is one of the programming language");
        int a = 5 , b = 10;
        System.out.println("addition:"+ (a+b));
        System.out.println("sub:"+(a-b));
        System.out.println("mul:"+(a*b));
        System.out.println("div:"+(a/b));
        System.out.println("modulus:"+(a%b));
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first no:");
            int num1 = sc.nextInt();
            System.out.println("Enter second no:");
            int num2 = sc.nextInt();
            System.out.println("Addition:"+(num1+num2));
            System.out.println("multiplication:"+(num1*num2));
            System.out.println("Modulus:"+(num1%num2));
            System.out.println("Subtraction:"+(num1-num2));
            System.out.println("Division:"+(num1/num2));
            if (num2!=0) {
                double division = (double) num1 / num2;
                System.out.println("Division:" + division);
            } else {
                System.out.println("Division by zero is not allowed.");
            }
            
            if(num2!=0){
                double modulo = (double) num1 % num2;
                System.out.println("Modulo:" + modulo);
            } else {
                
                System.out.println("Modulus by zero is not allowed.");
            }
            
            int []nums={1,2,3};
            for(int n : nums){
                System.out.println( n);
            }
            
            int [] [] num = {{1,2},{5,6}};
            System.out.println(num[0][0]);
            System.out.println(num[0][1]);
            System.out.println(num[1][0]);
            System.out.println(num[1][1]);
            
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();
            int[] userNums = new int[size];
            System.out.println("Enter"+ size +"numbers");
            for(int i = 0; i<size;i++) userNums[i]=sc.nextInt();
            System.out.println("Enetr array elements:"+Arrays.toString(userNums));
            int sum =0;
            for(int n:userNums) sum+=n;
            System.out.println("Sum of array elements:"+sum);
        }





    }

}
    



