import calculator.model.ComplexNumber;
import calculator.service.CalculatorService;
import calculator.service.ComplexNumberCalculatorService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        CalculatorService calculator = new ComplexNumberCalculatorService();
        ComplexNumber a = new ComplexNumber(1.0, 2.0);
        ComplexNumber b = new ComplexNumber(2.0, 3.0);

        ComplexNumber resultAdd = calculator.add(a, b);
        logger.info("Result of adding: {}", resultAdd);

        ComplexNumber resultMultiply = calculator.multiply(a, b);
        logger.info("Result of multiplication: {}", resultMultiply);

        ComplexNumber resultDivide = calculator.divide(a, b);
        logger.info("Result of division: {}", resultDivide);
    }
}