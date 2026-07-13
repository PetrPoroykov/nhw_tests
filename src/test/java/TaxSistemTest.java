import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.taxes.TaxSystem;
import ru.netology.taxes.TaxSystem15;
import ru.netology.taxes.TaxSystem6;

public class TaxSistemTest {

    TaxSystem taxSystem6 = new TaxSystem6();
    TaxSystem taxSystem15 = new TaxSystem15();

    @Test
    public void calcTax6ForTest() {
        int debit = 100;
        int credit = 50;
        int result = taxSystem6.calcTaxFor(debit, credit);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void calcTax15ForTest() {
        int debit = 100;
        int credit = 50;
        int result = taxSystem15.calcTaxFor(debit, credit);
        Assertions.assertEquals(7, result);
    }
}
