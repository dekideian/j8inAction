package test;

public class DishRebaseMergeTests {
	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;
	private final String bleah;
	private final String helloStuff; 
	private final String testingBranch;
	private final boolean intermediate;
	
	public DishRebaseMergeTests(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
		this.bleah = "just master bleah";
		this.helloStuff="Hello my darling";
		this.testingBranch="asdf";
		this.intermediate=true;
	}
	public String getTestingBranch() {
		return testingBranch;
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
	
	public void whatTheHell(){
		System.out.println("display this: "+this.helloStuff);
	}
	public enum Type { MEAT, FISH, OTHER }
	
	public static void main(){
		System.out.println("useful for testing");
	}
	public static void display(String message){
		System.out.println("[]:"+message);
	}
}