public class Main {

    public static void main(String[] args) {
        String operation;
        Calculator calculator = new Calculator();
        calculator.init();

        while (true) {
            System.out.println("Введите \"c\" чтобы очистить результат, введите \"s\" чтобы закончить работу. " +
                    "Чтобы продолжить введите любое значение и нажмите Enter");
            operation = calculator.scanner.next();
            if (operation.equals("s")) {
                break;
            }
            if (operation.equals("c")) {
                calculator.init();
            } else {
                calculator.calculationStart();
            }
        }
    }
}

