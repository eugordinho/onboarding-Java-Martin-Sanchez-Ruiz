package day_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner( System.in );

        CalculatorWithMenu operation = new CalculatorWithMenu();

        int option;

        do{
            operation.displayMenu();

            option = operation.selectOption();

            if ( option > 4 || option < 0) System.out.println( " Select a correct option ");
            else if ( option == 0 ) System.out.println( "Exit successful " );
            else {
                System.out.println("Enter 2 numbers: ");

                int a = scanner.nextInt();
                int b = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Addition equals: " + operation.addition(a, b));
                        break;

                    case 2:
                        System.out.println("Subtraction equals: " + operation.subtraction(a, b));
                        break;

                    case 3:
                        System.out.println("Multiplication equals: " + operation.multiplication(a, b));
                        break;

                    case 4:
                        if (b == 0) throw new ArithmeticException("Division by zero is undefined.");
                        else System.out.println("Division equals: " + operation.division(a, b));
                        break;

                }
            }
        } while( option != 0 );
    }
}
