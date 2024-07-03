package org.example.calculator;

public class TaxCalculator implements TaxStrategy {


    private final TaxStrategy taxStrategy;

    public TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax() {
        return this.taxStrategy.calculateTax();
    }
}
