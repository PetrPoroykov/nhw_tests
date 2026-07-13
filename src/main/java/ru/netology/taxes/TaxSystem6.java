package ru.netology.taxes;

public class TaxSystem6 extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int)(debit * 6 / 100);
    }
}
