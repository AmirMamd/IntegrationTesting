import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrayBalanceTest{
    @Test
    public void driver(){
        CoffeeTrayBalance b1= new CoffeeTrayBalance();
        assertEquals(3,b1.checkBalance(4,3));
        assertEquals(2,b1.checkBalance(2,3));
        assertEquals(3,b1.checkBalance(3,3));
        assertEquals(0,b1.checkBalance(-2,3));
        assertEquals(0,b1.checkBalance(4,-9));
    }


}