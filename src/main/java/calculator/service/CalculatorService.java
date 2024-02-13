package calculator.service;

import calculator.model.ComplexNumber;

public interface CalculatorService {
    ComplexNumber add(ComplexNumber a, ComplexNumber b);
    ComplexNumber multiply(ComplexNumber a, ComplexNumber b);
    ComplexNumber divide(ComplexNumber a, ComplexNumber b);
}