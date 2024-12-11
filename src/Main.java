import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.print("Please enter your first number: ");
        float a = input.nextFloat();
        System.out.print("Please enter your second number: ");
        float b = input.nextFloat();
        System.out.print("Please enter the calculation method you want to do (1 = +,2 = -,3 = *,4 = /): ");
        float c = input.nextFloat();
        input.nextLine();

        if (c == 1) {
            System.out.println(a+b);
        } else if (c == 2) {
            System.out.println(a - b);
        } else if (c == 3) {
            System.out.println(a * b);
        } else if (c == 4) {
            System.out.println(a / b);
        } else {
            System.out.println("Error! Not an operator.");
        }
    }
}
