package lesson8;
import java.util.Scanner;

public class lesson8Task1 {
    public static void main (String[] args) {
        System.out.println("Это программа калькулатор!");
        int num1 = getInt();
        String operation = getOperation();
        int num2 = getInt();

        System.out.println(calc(num1, num2, operation));
    }

    public static int getInt() {
        System.out.println("Введите целое число:");
        Scanner sc = new Scanner(System.in);
        int consoleInInt = sc.nextInt();
        return consoleInInt;
    }

    public static String getOperation() {
        System.out.println("Введите оператор:");
        Scanner sc2 = new Scanner(System.in);
        String consoleInString = sc2.nextLine();

        switch (consoleInString) {
            case "*":
                return "*";
            case "+":
                return "+";
            case "-":
                return "-";
            case "/":
                return "/";
            default:
                return "Введите +, -, *, /";
        }

    }

    public static int calc(int num1, int num2, String operation) {
        if(operation == "*") {
            return num1*num2;
        } else if (operation == "+") {
            return num1+num2;
        } else if (operation=="-") {
            return num1-num2;
        } else if (operation == "/") {
            return num1/num2;
        } else {
            return 1488;
        }
    }

}
