import java.util.Scanner;

public class Calculator {
    private static double[] results = new double[100];
    private static int resultsCount = 0;
    public static void main(String[] args)
    {
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.print("Хотите ли вы возвести число в факториал?");
            String choose = sc.nextLine();

            if (choose.equalsIgnoreCase("Нет")){
                System.out.print("Введите первое число - ");
                double a = sc.nextDouble();
                System.out.print("Введите второе число - ");
                double b = sc.nextDouble();
                System.out.print("Введите символ для проведения математической операции (+, -, *, /, %) - ");
                char op = sc.next().charAt(0);
                double result = solve(a, b, op);
                System.out.println("Результат: " + result);
                results[resultsCount] = result;
                resultsCount++;
            }
            else if (choose.equalsIgnoreCase("Да")){
                System.out.print("Введите число - ");
                int a = sc.nextInt();
                int result = factorial(a);
                System.out.println("Результат: " + result);
                results[resultsCount] = result;
                resultsCount++;
            }
            sc.nextLine();
            System.out.println("Хотите ли вы продолжить работу с калькулятором?");
            String choice = sc.nextLine();

            if (!choice.equalsIgnoreCase("да")) {
                break;
            }
        }
    }
    static int factorial(int a){
        if (a == 1){
            return 1;
        }
        return a * factorial(a - 1);
    }
    public static double solve(double a, double b, char op)
    {
        double answer = 0;
        if (op == '+') {
            answer = a + b;
            return answer;
        }
        else if (op == '-') {
            answer = a - b;
            return answer;
        }
        else if (op == '*') {
            answer = a * b;
            return answer;
        }
        else if (op == '%') {
            answer = a % b;
            return answer;
        }
        else if (op == '/') {
            answer = a / b;
            return answer;
        }
        return answer;
    }
    public static double solve(int a, int b, char op) {
        return solve((double) a, (double) b, op);
    }
}

