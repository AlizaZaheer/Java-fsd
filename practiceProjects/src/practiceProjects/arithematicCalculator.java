package practiceProjects;


import java.util.Scanner;

public class arithematicCalculator {
	public static void main(String[] args) {

        //  user input
        Scanner scanner = new Scanner(System.in);

        //variables
        int firstNumber, secondNumber, result;

        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextInt();
        
        System.out.println("please enter the arithmetic operator for the operation");
        // Perform the arithmetic operation
        char operator = scanner.next().charAt(0);
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '%':
            	result=firstNumber%secondNumber;
            	break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        // Display the result
        System.out.println("The result is: " + result);
        scanner.close();
    }
}


