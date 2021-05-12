import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);
    private double firstValue;
    private double secondValue;
    private double result;

    public void init() {
        System.out.println("Введие число для вычисления");
        try {
            firstValue = scanner.nextDouble();
        } catch (InputMismatchException exception) {
            System.out.println("Ошибка. Буквы и символы недопустимы.");
        }
        calculationStart();
    }

    public void calculationStart() {
        System.out.println("Введите операцию, которую собираетесь совершить (* / + -) ");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case ('/'):
                System.out.println("Введите значение делитель");
                secondValue = scanner.nextDouble();
                if (secondValue == 0){
                    System.out.println("Значение 0 некорректно");
                    result = 1;
                    break;
                }
                result = firstValue / secondValue;
                System.out.print("result = ");
                System.out.printf("%.2f", result);
                System.out.println();
                firstValue = result;
                break;
            case ('*'):
                System.out.println("Введите значение множитель");
                secondValue = scanner.nextDouble();

                result = firstValue * secondValue;
                System.out.print("result = ");
                System.out.printf("%.2f", result);
                System.out.println();
                firstValue = result;
                break;
            case ('+'):
                System.out.println("Введите значение слагатель");
                secondValue = scanner.nextDouble();

                result = firstValue + secondValue;
                System.out.print("result = ");
                System.out.printf("%.2f", result);
                System.out.println();
                firstValue = result;
                break;
            case ('-'):
                System.out.println("Введите значение вычитатель");
                secondValue = scanner.nextDouble();

                result = firstValue - secondValue;
                System.out.print("result = ");
                System.out.printf("%.2f", result);
                System.out.println();
                firstValue = result;
                break;
        }
    }
}