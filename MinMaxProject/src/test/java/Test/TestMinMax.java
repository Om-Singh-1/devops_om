package Test;

import static org.junit.Assert.assertEquals;
import static com.finder.min_max;

import org.junit.jupiter.api.Test;

import com.finder.min_max.MinMax;

public class TestMinMax {
	
	@Test
	public void checkFunctionality() {
		
		MinMax number = new MinMax();
		
		int[] testNumbers = {1, 55, 66, 56, 2, 8, 9, 5, 10, 11};
		
		assertEquals(1, number.min_finder(testNumbers, 10));
		assertEquals(66, number.max_finder(testNumbers, 10));
		
	}

}
