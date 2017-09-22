package IT7320.Assignment3;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import junit.framework.TestCase;

public class SubtractCalcImplementationTest extends TestCase {
	
	SubtractCalcImplementation obj;
	int x,y;


	protected void setUp() throws Exception {
		
		obj =new SubtractCalcImplementation();
		x=8;
		y=6;
		
		CalcInterface mockObj= mock(CalcInterface.class);
		when(mockObj.subtract(x,y)).thenReturn(x-y);
		obj.setIntObj(mockObj);
		
		
	}

	protected void tearDown() throws Exception {
		
		obj=null;
		x=0;
		y=0;
		
	}




public void testSubtractTwoNums() {
assertEquals(2,obj.subtractTwoNums(x,y));
}
}