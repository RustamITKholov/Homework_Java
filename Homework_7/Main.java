public class Main {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculator();

        double a = 10;
        double b = 2;

        System.out.println("Сложение: " + calculator.add(a, b));
        System.out.println("Умножение: " + calculator.multiply(a, b));
        System.out.println("Деление: " + calculator.divide(a, b));
    }
}
