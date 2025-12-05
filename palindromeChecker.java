import java.util.Scanner;

public class palindromeChecker{

    public static boolean isPalindrome(String input){
        input = input.toLowerCase();
        String reversed = "";

        for(int i=input.length()-1; i>=0; i--){
            reversed += input.charAt(i);
        }
        return input.equals(reversed);
    }



    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number or string: ");
            String input = sc.nextLine();

            if (isPalindrome(input)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }
}
