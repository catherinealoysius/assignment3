package IT7320.Assignment3_TDD;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImplementationTest {
	
	private Implementation obj;

	@Before
	public void setUp() throws Exception {
		obj= new Implementation();
	}

	@After
	public void tearDown() throws Exception {
		obj= null;
	}
	

	@Test
	public void testAdd() {
		long ans= 49+ (-27) + 13 + (-19);
		assertEquals(ans, obj.add(49, -27, 13, -19)); 
		
		
		ans= 24+10+23;
		assertEquals(ans, obj.add(24, 10, 23));
		
		ans=5;
		assertEquals(ans, obj.add(5));
		
		
	}
	
	
	@Test
	public void testSub() {
		long ans= 49- 27 - 13 - (-19);
		assertEquals(ans, obj.sub(49, 27, 13, -19)); 
		
		ans=56-13;
		assertEquals(ans, obj.sub(56, 13));
		

}
}
