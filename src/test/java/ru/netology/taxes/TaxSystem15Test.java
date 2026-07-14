package ru.netology.taxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxSystem15Test {
TaxSystem taxSystem15 = new TaxSystem15();
    @Test
    void calcTaxFor15Test() {
        int debit = 100;
        int credit = 50;
        int result = taxSystem15.calcTaxFor(debit, credit);
        Assertions.assertEquals(7, result);
    }
}