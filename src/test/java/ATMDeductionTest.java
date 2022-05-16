import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ATMDeductionTest{
    @Test
    public void stubs(){
        ATMDeduction d1= new ATMDeduction();
        assertEquals(true,d1.deduct(3000));
        assertEquals(true,d1.deduct(18000));
        assertEquals(true,d1.deduct(20000));
        assertEquals(false,d1.deduct(290345));
        assertEquals(false,d1.deduct(-1111));
        assertEquals(false,d1.deduct(0));

    }
}