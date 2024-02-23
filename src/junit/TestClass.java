package junit;

import static org.junit.Assert.*;
import org.junit.Test;  

public class TestClass {

	@Test  
    public void testFindMax(){  
        assertEquals(4,Calculate.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,Calculate.findMax(new int[]{-12,-1,-3,-4,-2}));  
    }  
}
