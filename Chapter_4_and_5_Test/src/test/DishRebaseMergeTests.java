package test;

public class DishRebaseMergeTests {
	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;
	private final String bleah;
	private final boolean finalState;
	
	public DishRebaseMergeTests(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
		this.bleah = "just master bleah";
		this.finalState=true;
	}
	public String getBleah() {
		return bleah;
	}
	public String getName() {
		return name;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public int getCalories() {
		return calories;
	}
	public Type getType(){
		return type;
	}
	@Override
	public String toString() {
		return name;
	}
	public enum Type { MEAT, FISH, OTHER }
}
