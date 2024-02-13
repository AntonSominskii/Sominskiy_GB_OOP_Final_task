package calculator.model;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComplexNumber {

    private static final Logger logger = LogManager.getLogger(ComplexNumber.class);
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        ComplexNumber result = new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
        logger.info("Adding {} to {} results in {}", this, other, result);
        return result;
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        ComplexNumber conjugate = new ComplexNumber(other.real, -other.imaginary);
        ComplexNumber numerator = this.multiply(conjugate);
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        return new ComplexNumber(numerator.real / denominator, numerator.imaginary / denominator);
    }

    @Override
    public String toString() {
        return String.format("%f + %fi", real, imaginary);
    }
}