package IT7320.Assignment3;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import junit.framework.TestCase;

public class MultiplyCalcImplementationTest extends TestCase {

	MultiplyCalcImplementation obj;
	int x,y;

	
	protected void setUp() throws Exception {
		
		obj =new MultiplyCalcImplementation();
		x=5;
		y=6;
		
		CalcInterface mockObj= mock(CalcInterface.class);
		when(mockObj.multiply(x,y)).thenReturn(x*y);
		obj.setIntObj(mockObj);
		
		
	}

	protected void tearDown() throws Exception {
		
		obj=null;
		x=0;
		y=0;
		
	}

	public void testMultiplyTwoNums() {
		
		assertEquals(30,obj.multiplyTwoNums(x,y));
		
	}

	

}
