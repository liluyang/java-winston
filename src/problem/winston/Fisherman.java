package problem.winston;

import org.testng.annotations.Test;

public class Fisherman {
	public int solve() {
		int fish = 0;
		while (true) {
			fish++;
			int total = fish;
			if (total % 5 != 1) continue;
			total = (total - 1) / 5 * 4;
			if (total % 5 != 1) continue;
			total = (total - 1) / 5 * 4;
			if (total % 5 != 1) continue;
			total = (total - 1) / 5 * 4;
			if (total % 5 != 1) continue;
			total = (total - 1) / 5 * 4;
			if (total % 5 != 1) continue;
			break;
		}
		return fish;
	}
	
	@Test
	public void test() {
		System.out.println(solve());
	}
}
