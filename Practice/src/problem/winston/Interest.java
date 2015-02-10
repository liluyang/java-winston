package problem.winston;

public class Interest {
	public double johnAsset() {
		double asset = 100000;
		double interest = 0.05;
		for (int year = 26; year < 66; year++) {
			asset *= 1 + interest;
		}
		return asset;
	}
	
	public double susanAsset() {
		double asset = 10000;
		double interest = 0.05;
		for (int year = 26; year < 66; year++) {
			asset = (1 + interest) * asset + 10000;
		}
		return asset;
	}
	
}
