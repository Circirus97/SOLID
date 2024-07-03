package org.example.calculator;

public class USATaxStrategy implements TaxStrategy{
    @Override
    public double calculateTax() {
        // Lógica para calcular el impuesto en UK
        return 0.1;
    }
}
