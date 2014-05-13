package gradlebootstrap.web;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringsControllerTest {

	private final static String in="1234",expected="4321";
	
	@Test
	public void testRevert() {		
		StringsController stringsController = new StringsController();
		assertEquals(expected, stringsController.revert(in));
	}

}
