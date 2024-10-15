import org.example.MoneyUtil;
import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void moneyTest(){
        String money = MoneyUtil.format(1000);

        //Primer parametro lo que se espera, segundo lo que se tiene
        Assert.assertEquals("$1000.00", money);

    }

    @Test
    public void moneyTestWithNegativeValue(){
        String money = MoneyUtil.format(-1000);
        Assert.assertEquals("-$1000.00", money);
    }

    @Test
    public void euroMoneyTest() {
        String money = MoneyUtil.format(1000, "€");
        Assert.assertEquals("€1000.00", money);

        
    }

    //waiting for an exception
    @Test(expected = IllegalArgumentException.class)
    public void notNullExceptionMoneyTest() {
        MoneyUtil.format(1000, null);
    }


}
