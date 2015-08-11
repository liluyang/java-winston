package study.winston;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.testng.annotations.Test;

public class MapTest {
	@Test
	public void test() {
		Scanner input = new Scanner(System.in);
		String cat;
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("God Cat", -1);
		map.put("Cat", 0);
		map.put("Tank Cat", 1);
		map.put("Axe Cat", 2);
		map.put("Gross Cat", 3);
		map.put("Cow Cat", 4);
		map.put("Bird Cat", 5);
		map.put("Fish Cat", 6);
		map.put("Lizard Cat", 7);
		map.put("Titan Cat", 8);
		map.put("Actress Cat", 9);
		map.put("Kung Fu Cat", 10);
		map.put("Mr.", 11);
		map.put("Bondage Cat", 12);
		map.put("Dom Cat", 13);
		map.put("Cats in a Box", 14);
		map.put("Panties Cat", 15);
		map.put("Moneko", 16);
		map.put("Tricycle Cat", 17);
		map.put("Ninja Cat", 18);
		map.put("Zombie Cat", 19);
		map.put("Samurai Cat", 20);
		
		while (true) {
			cat = input.next();
			System.out.println(map.get(cat));
		}
	}
}
