package ru.netology.taxes;

public class TaxSystem15 extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        if (debit < credit) {
            return 0;
        } else {
            return  (debit - credit) * 15 / 100;
        }
    }
}
