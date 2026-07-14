package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Deals.Expenditure;
import ru.netology.Deals.Sale;
import ru.netology.taxes.TaxSystem15;

class CompanyTest {


    @Test
    void applyDealsTest() {
        Company companyWithDeals = new Company("A company with deals", new TaxSystem15());
        companyWithDeals.getDeals()[0] = new Sale("Товар_0", 100);
        companyWithDeals.getDeals()[1] = new Expenditure("Товар_1", 10);
        companyWithDeals.getDeals()[2] = new Sale("Товар_2", 100);
        companyWithDeals.getDeals()[3] = new Expenditure("Товар_3", 10);
        companyWithDeals.getDeals()[4] = new Sale("Товар 4", 100);
        companyWithDeals.getDeals()[5] = new Expenditure("Товар_5", 10);
        companyWithDeals.getDeals()[6] = new Sale("Товар_6", 100);
        companyWithDeals.getDeals()[7] = new Expenditure("Товар_7", 20);
        companyWithDeals.getDeals()[8] = new Sale("Товар_8", 100);
        companyWithDeals.getDeals()[9] = new Expenditure("Товар_9", 50);

        int result = companyWithDeals.applyDeals();

        Assertions.assertEquals(400, result);
    }
}