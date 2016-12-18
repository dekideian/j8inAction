package j8.Chapter3Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {
	public static <T> List<T> filter(List<T> list, Predicate<T> p) {
		List<T> results = new ArrayList<>();
		for(T s: list){
			if(p.test(s)){
				results.add(s);
			}	
		}
		return results;
	}
	public static void main(String[] args){
		List<String> listOfStrings = Arrays.asList("a", "b", "", "c");
		Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
		List<String> nonEmpty = filter(listOfStrings, nonEmptyStringPredicate);
	
		List<Apple> listOfApples = Arrays.asList(new Apple(25),new Apple(35), new Apple(15));
		Comparator<Apple> c = Comparator.comparing(Apple::getWeight);
	}
}
