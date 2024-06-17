
public class BasicCalculator implements Calculator {
    private Logger logger = Logger.getLogger();

    @Override
    public double add(double a, double b) {
        double result = a + b;
        logger.log("Сложение: " + a + " + " + b + " = " + result);
        return result;
    }

    @Override
    public double multiply(double a, double b) {
        double result = a * b;
        logger.log("Умножение: " + a + " * " + b + " = " + result);
        return result;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            logger.log("Деление на ноль: " + a + " / " + b);
            throw new ArithmeticException("Нельзя делить на ноль!");
        }
        double result = a / b;
        logger.log("Деление: " + a + " / " + b + " = " + result);
        return result;
    }
}
