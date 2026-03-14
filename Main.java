import java.awt.*;
import java.util.Scanner;

void main()
{
    String continueCalculation;
    do
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double first = scan.nextDouble();

        char operator;
        do {
            System.out.print("Enter operator (+ - * /): ");
            operator = scan.next().charAt(0);
        }while(operator != '+' && operator != '-' && operator != '*' && operator != '/');

        System.out.print("Enter second number: ");
        double second = scan.nextDouble();

        if (operator == '/' && second == 0){
            System.out.println("Dividing by 0 is impossible");
        }

        double result = 0;

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
        System.out.println("Result: " + result);

        System.out.print("Would you like to continue? (yes/no) : ");
        continueCalculation = scan.next();

    }while(!continueCalculation.equalsIgnoreCase("no"));
}