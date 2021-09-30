import java.util.Comparator;

public class Hero {

	// attributs
	private String name;
	private int age;

	// constructeurs
	public Hero(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// accesseurs (getters)
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	// mutateurs (setters)
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Hero [name=" + name + ", age=" + age + "]";
	}

	// compare hero by name
	public static Comparator<Hero> HeroNameComparator = new Comparator<Hero>() {

		public int compare(Hero s1, Hero s2) {
			String hero1 = s1.getName().toUpperCase();
			String hero2 = s2.getName().toUpperCase();

			// ascending order
			return hero1.compareTo(hero2);

		}
	};
	// compare hero by age
	public static Comparator<Hero> HeroAgeComparator = new Comparator<Hero>() {

		public int compare(Hero s1, Hero s2) {

			int h1 = s1.getAge();
			int h2 = s2.getAge();

			return h2 - h1;

		}
	};

}