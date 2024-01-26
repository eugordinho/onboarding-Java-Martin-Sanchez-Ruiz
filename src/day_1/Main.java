package day_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        String name = "Martin";

        byte age = 26;

        System.out.println("My name is " + name + " and my age is " + age);


        welcome();

        maxNum();

        isOddOrEven();
        sameChar();

        boolean prime = isPrime();

        if ( prime ) System.out.println( "Its prime" );
        else System.out.println( "Is not prime" );

        int[] arr = {7, 2, 3, 4, 5};

        System.out.println( "The sum of odd number is: " + arrSumOdd( arr ) );


        int[] arr2 = {7, 2, 3, 4, 5, 7, 9, 10};
        arrEvenSumP( arr2 );

 */
        calculator();
    }

    public static void welcome() {
        System.out.println("Welcome!");
    }

    public static void maxNum() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter 3 numbers: ");

        Integer numero1 = scanner.nextInt();
        Integer numero2 = scanner.nextInt();
        Integer numero3 = scanner.nextInt();

        Integer max_num = 0;

        if (numero1 >= numero2 && numero1 >= numero3) max_num = numero1;
        else if (numero2 >= numero1 && numero2 >= numero3) max_num = numero2;
        else max_num = numero3;

        System.out.println("The largest number is: " + max_num);
    }

    public static void isOddOrEven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        Integer numero = scanner.nextInt();

        if (numero % 2 == 0) System.out.println("The entered number is even");
        else System.out.println("The entered number is odd");

    }

    public static void sameChar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 2 words: ");

        String palabra1 = scanner.next();
        String palabra2 = scanner.next();

        if (palabra1.equals(palabra2)) System.out.println("They are the same string");
        else System.out.println("They aren't the same string");
    }

    public static boolean isPrime() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        Integer number = scanner.nextInt();

        if (number == 1) return false;
        if (number == 2) return true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int arrSumOdd(int[] array) {
        int sumOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sumOdd += array[i];
            }
        }

        return sumOdd;
    }

    public static void arrEvenSumP(int[] array) {
        int sumPrime = 0;

        System.out.println( "This numbers are even: ");

        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            if (array[i] % 2 == 0) System.out.print(" "+array[i]);

            for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                if (array[i] % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && array[i] > 1) sumPrime += array[i];

        }

        System.out.println( "\nThe sum of prime numbers is: " + sumPrime );
    }

    public static int sum( int a, int b){
        return a + b;
    }
    public static int subtraction( int a, int b){
        return a - b;
    }
    public static int multiplication( int a, int b){
        return a * b;
    }
    public static float division( float a, float b){
        return a / b;
    }

    public static void calculator(){
        Scanner scanner = new Scanner( System.in );
        int option;
        do{
            System.out.println( "Select an option: ");
            System.out.println( "1) Sum\n2) Subtraction\n3) Multiplication\n4) Division\n0) Exit");

            option = scanner.nextInt();

            if ( option > 4 || option < 0) System.out.println( " Select a correct option ");
            else if ( option == 0 ) System.out.println( "Exit successful " );
            else {
                System.out.println( "Enter 2 numbers: " );

                int a = scanner.nextInt();
                int b = scanner.nextInt();

                switch ( option ){
                    case 1:
                        System.out.println( "Sum equals: " + sum( a, b ) );
                        break;

                    case 2:
                        System.out.println( "Subtraction equals: " + subtraction( a, b ) );
                        break;

                    case 3:
                        System.out.println( "Multiplication equals: " + multiplication( a, b ) );
                        break;

                    case 4:
                        if ( b == 0 ) System.out.println( "Division by zero is undefined" );
                        else System.out.println( "Division equals: " + division( a, b ) );
                        break;

                    case 0:
                        break;
                }
            }
        } while( option != 0 );
    }
}