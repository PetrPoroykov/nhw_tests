package ru.netology.taxes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxSystem6Test {
TaxSystem taxSystem6 = new TaxSystem6();
    @Test
    void calcTaxFor6Test() {
        int debit = 100;
        int credit = 50;
        int result = taxSystem6.calcTaxFor(debit, credit);
        Assertions.assertEquals(6, result);
    }
}