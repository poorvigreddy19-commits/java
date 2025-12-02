import java.util.Scanner;

public class java {
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number:");
        // int num = sc.nextInt();
        // if(num%2==0){
        //     System.out.println("The given number is even!");

        // }
        // else{
        //     System.out.println("The given number is odd!");
        // }

        
       
        // Scanner sc = new Scanner(System.in);

        // String opertations--------------------------------------------------

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string:");
        // String s = sc.nextLine();

        // System.out.println("Length of string:"+s.length());
        // System.out.println(s.toLowerCase());
        // System.out.println(s.toUpperCase());

        // //counting number of vowels in a string


        // int vowels = 0;
        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
        //         vowels++;
                
        //         }
                
        //     }
        //     System.out.println("Number of vowels in the string:"+vowels);

        // ----------------------------------------------------------

        // 1. String

        
        // Scanner sc = new Scanner(System.in);
        // String name;
        // System.out.print("Enter your name: ");
        // name = sc.nextLine();
        // System.out.println("Hello, " + name);
        // System.out.println("Length = " + name.length());
        // System.out.println("Upper case = " + name.toUpperCase());
        // System.out.println("Lower case = " + name.toLowerCase());
    
        
        // // 2. Break
        //  for (int i = 1; i <= 5; i++) {
        //     if (i == 3) break; // Exits loop
        //     System.out.println("i = " + i);
        // }

        // // 3. Continue
        // for (int i = 1; i <= 5; i++) {
        //     if (i == 3) continue; // Skips the rest of the loop when i is 3
        //     System.out.println("i = " + i);

        // }
        // 4. Return

        // System.out.println("Before return");
        // if (true) return;
        // System.out.println("After return");


        // 5. Reverse a number


        try ( 
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int reversed = 0;
            while (number > 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
            System.out.println("Reversed number: " + reversed);
        }
        // 6. While loop

          int i = 1;
        while (i <= 5) {
            System.out.println("While loop count: " + i);
            i++;
        }


        int count = 1;
        do {
            System.out.println("Do-While count: " + count);
            count++;
        } while (count <= 5);
    }


        }
    

    
         

