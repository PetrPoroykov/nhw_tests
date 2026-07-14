package ru.netology;

import ru.netology.Deals.Expenditure;
import ru.netology.Deals.Sale;
import ru.netology.taxes.TaxSystem;
import ru.netology.taxes.TaxSystem15;
import ru.netology.taxes.TaxSystem6;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1 (обязательное)");

        Company company0 = new Company("Zero company", new TaxSystem());
        company0.setDebit(150);
        company0.setCredit(50);
        company0.payTaxes();

        Company company1 = new Company("The first company", new TaxSystem());
        company1.setTaxSystem(new TaxSystem6());
        company1.setDebit(150);
        company1.setCredit(50);
        company1.payTaxes();


        Company company2 = new Company("The second company", new TaxSystem());
        company2.setTaxSystem(new TaxSystem15());
        company2.setDebit(150);
        company2.setCredit(50);
        company2.payTaxes();

        Company company3 = new Company("The third company", new TaxSystem());
        company3.setTaxSystem(new TaxSystem15());
        company3.setDebit(49);
        company3.setCredit(50);
        company3.payTaxes();

        System.out.println("Задание 2 (необязательное)");

        Company companyWithDeals = new Company("A company with deals", new TaxSystem());
        companyWithDeals.setTaxSystem(new TaxSystem15());



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

        printingListResults(companyWithDeals);
    }

    public static void printingListResults(Company company) {
        System.out.println();
        company.printingListTransactions();
        System.out.println("Разница между доходами и расходами составляет : " + company.applyDeals() + " руб.");
    }
}
