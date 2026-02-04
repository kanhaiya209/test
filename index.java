import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Calculater Progam:");
        System.out.print("Enter Numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        int result;
        System.out.println("Enter the operator: ");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                result=num1+num2;
                System.out.println("The result of two numbers are: "+result);
                break;
            case 2:
                result=num1-num2;
                System.out.println("The result of two numbers are: "+result);
                break;
            case 3:
                result=num1*num2;
                System.out.println("The result of two numbers are: "+result);
                break;
            case 4:
                result=num1/num2;
                System.out.println("The result of two numbers are: "+result);
                break;

            default:
                System.out.println("Invalid!!");
                break;
        }
    }
}
