package CS_348_SP_2019.CIExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2019.CIExercise.EndsWith6;

public class EndsWith6Test {

	@Test
	public void testToString() {
		EndsWith6 six = new EndsWith6();
		// add your name to the expected string, after the all the other names in the form John Smith\n
		assertEquals("EndsWith6 [names=Chris Radkowski\n]", six.toString());
	}

}
