import java.util.Scanner;

public class reverse {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int reversed = 0;
        int original = n;
        while(n!=0){
            int digit=n%10;
            reversed = reversed*10+digit;
            n=n/10;
        }
        if( original == reversed){
            System.out.println(original +" is a palindrome");
        }
        else{
            System.out.println(original+" is not a palindrome");
        }

        System.out.println("Original number:"+original);
        System.out.println("Reversed number:"+reversed);
        

        }
}



