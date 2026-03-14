import java.awt.*;
import java.util.Scanner;

void main()
{
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter first number: ");
    double first = scan.nextDouble();

    System.out.println("Enter operator (+ - * /): ");
    char operator = scan.nextLine().charAt(0);

    System.out.println("Enter second number: ");
    double second = scan.nextDouble();

    if (operator == '/' && second == 0){
        System.out.println("Deviding by 0 is impossible");
    }

    double result;

    switch (operator){
        case ('+'):
            result = first + second;
            break;
        case ('-'):
            result = first - second;
            break;
        case ('*'):
            result = first * second;
            break;
        case ('/'):
            result = first / second;
            break;
    }

}