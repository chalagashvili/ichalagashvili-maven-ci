import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by GM on 5/5/2016.
 */
public class ZeroCheckerTest {

    private ZeroChecker zChick;
    private ValidChecker valid;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        valid = mock(ValidChecker.class);
        zChick = new ZeroChecker(valid);
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

    @Test
    public void testWithMock(){
        when(valid.dumbChecker()).thenReturn(true);
        assertFalse(zChick.checkIfZeroWithMockito(4));
    }

}
