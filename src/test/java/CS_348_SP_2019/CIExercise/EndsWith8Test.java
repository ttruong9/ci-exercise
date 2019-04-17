
package CS_348_SP_2019.CIExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import CS_348_SP_2019.CIExercise.EndsWith8;

public class EndsWith8Test {

	@Test
	public void testToString() {
		EndsWith8 eight = new EndsWith8();
		// add your name to the expected string, after the all the other names in the form John Smith\n
		assertEquals("EndsWith8 [names=Gloris Pina\n]", eight.toString());

	}

}

