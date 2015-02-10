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
	
	@Test
	public void testSusan95Asset() {
		assertEquals(new Interest().susan95Asset(50000), 1990115.6128758013);
	}
	
	@Test
	public void testSusan95Asset2() {
		assertEquals(new Interest().susan95Asset(60000), 1335727.1378456678);
	}
	
	@Test
	public void testSusan95Asset3() {
		assertEquals(new Interest().susan95Asset(80000), 26950.187785402333);
	}
}
