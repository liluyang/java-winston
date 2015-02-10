package problem.winston;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class InterestTest {
	@Test
	public void testJohnAsset() {
		assertEquals(new Interest().johnAsset(), 703998.8712124656);
	}
	
	@Test
	public void testSusanAsset() {
		assertEquals(new Interest().susanAsset(), 1278397.629546177);
	}
}
