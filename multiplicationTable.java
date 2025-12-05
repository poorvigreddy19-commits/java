import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.print("Enter a number to print its multiplication table: ");
        //int number = sc.nextInt();

        //System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            for (int j=1 ; j<=10 ; j++){
                //System.out.print(j);
                System.out.print(j+ " × " + i + " = " + (j * i)+ "      ");
            }
            //if(i==4) continue;
            System.out.println();
        }

        sc.close();
    }
}
