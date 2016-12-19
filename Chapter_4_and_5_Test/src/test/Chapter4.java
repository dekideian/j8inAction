package test;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

import java.util.Arrays;
import java.util.List;

public class Chapter4 {
	public static void main(String[] args){
		List<Dish> menu = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH) );
		
	
		System.out.println("The full list ");
		menu.forEach(System.out::println);
		System.out.println("-----------------");
		List<String> threeHighCalorieWise = menu.stream()
		.filter((d)-> d.getCalories()<500)
		.limit(3)
		.map(Dish::getName)
		.collect(toList());
		threeHighCalorieWise.forEach(System.out::println);
		
	}
	
}
