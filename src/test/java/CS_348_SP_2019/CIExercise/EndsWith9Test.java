package CS_348_SP_2019.CIExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2019.CIExercise.EndsWith9;

public class EndsWith9Test {

	@Test
	public void testToString() {
		EndsWith9 nine = new EndsWith9();
		// add your name to the expected string, after the all the other names in the form John Smith\n
		assertEquals("EndsWith9 [names=Brian Soltan\n]", nine.toString());

	}

}
