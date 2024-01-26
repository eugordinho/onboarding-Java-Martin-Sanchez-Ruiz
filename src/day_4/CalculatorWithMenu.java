package day_4;

import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu, CalculatorOperations{

    Scanner scanner = new Scanner( System.in );
    int option;



    @Override
    public void displayMenu() {
        System.out.println( "Select an option: ");
        System.out.println( "1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n0) Exit");
    }

    @Override
    public int selectOption() {

        option = scanner.nextInt();

        return option;
    }

    @Override
    public int addition ( int a, int b) {
        return a + b;
    }

    @Override
    public int multiplication ( int a, int b ) {
        return a * b;
    }

    @Override
    public int subtraction ( int a, int b ){
        return a - b;
    }

    @Override
    public float division( float a, float b ) {
        return a / b;
    }
}
