import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by GM on 5/5/2016.
 */
public class ZeroCheckerTest {

    private ZeroChecker zChick;

    @Before
    public void setup(){
        zChick = new ZeroChecker();
    }

    @Test
    public void checkDifferentValues(){
        assertTrue(zChick.checkIfZero(0));
    }

    @Test
    public void checkAnotherOne(){
        assertFalse(zChick.checkIfZero(1));
    }

    @Test
    public void checkAnotherTwo(){
        assertFalse(zChick.checkIfZero(-5));
    }

    @Test
    public void checkAnotherThree(){
        assertFalse(zChick.checkIfZero(4));
    }

    @Test
    public void checkAnotherFour(){
        assertFalse(zChick.checkIfZero(17));
    }


}
