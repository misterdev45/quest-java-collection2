import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thanos {

	public static void main(String[] args) {

		List<Hero> heroes = new ArrayList<>();
		heroes.add(new Hero("Hulk", 49));
		heroes.add(new Hero("Black Widow", 34));
		heroes.add(new Hero("Captain America", 100));
		heroes.add(new Hero("Thor", 1501));

		// Hero to implements Comparable and sort by name (ascending)

		System.out.println("\nOrder by name:");
		Collections.sort(heroes, Hero.HeroNameComparator);
		showList(heroes);

		System.out.println("\nOrder by age:");
		Collections.sort(heroes, Hero.HeroAgeComparator);
		showList(heroes);
	}

	private static void showList(List<Hero> heroes) {

		for (Hero hero : heroes) {
			System.out.println(hero.getName() + ", " + hero.getAge());
		}
	}

}