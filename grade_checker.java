import java.util.Scanner;
public class grade_checker {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks= sc.nextInt();
/*
        if( marks>= 90){
            System.out.println("GRADE A");
        }
        else if( marks>= 75){
            System.out.println("GRADE B");
        }
        else if( marks>= 50){
            System.out.println("GRADE C");
        }
        else {
            System.out.println("FAIL");
        }


 */
        String grade= (marks>= 90)?"A":(marks>= 75)?"B":(marks>= 50)?"C":"Fail";
        System.out.println("GRADE IS "+ grade);

    }
}
