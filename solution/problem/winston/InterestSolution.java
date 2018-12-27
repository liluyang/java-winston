package problem.winston;

public class InterestSolution {
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
	
	public double susan95Asset(double livingCost) {
		double asset = susanAsset();
		double interest = 0.05;
		for (int year = 66; year < 95; year++) {
			asset = (asset - livingCost) * (1 + interest);
		}
		return asset;
	}
}
