package apps;

import java.util.Arrays;
import java.util.List;

import trade.Trader;
import transaction.Transaction;

public class Application {

	public static void main(String[] args) {
		
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
			new Transaction(brian, 2011, 300),
			new Transaction(raoul, 2012, 1000),
			new Transaction(raoul, 2011, 400),
			new Transaction(mario, 2012, 710),
			new Transaction(mario, 2012, 700),
			new Transaction(alan, 2012, 950)
		);
		//1st
//		transactions.stream().filter(trans -> (trans.getYear()==2011))
//			.sorted((a1,a2)->Integer.compare(a1.getValue(), a2.getValue()))
//			.forEach(System.out::print);
		//2nd
//		transactions.stream().map(Transaction::getTrader)
//			.map(Trader::getCity)
//			.distinct()
//			.forEach(System.out::print);
		//3rd
//		transactions.stream()
//			.map(Transaction::getTrader)
//			.filter(trader->trader.getCity().equals("Cambridge"))
//			.sorted((a,b)->a.getName().compareTo(b.getName()))
//			.forEach(System.out::print);
		//4th
//		transactions.stream()
//		.map(Transaction::getTrader)
//		.sorted((a,b)->a.getName().compareTo(b.getName()))
//		.map(Trader::getName)
//		.distinct()
//		.forEach(System.out::print);
		//5h
//		boolean isMilanPresent = transactions.stream()
//			.map(Transaction::getTrader)
//			.anyMatch((trade)->trade.getCity().equals("Milan"));
//		System.out.println(isMilanPresent);
		//6th Print all transactions’ values from the traders living in Cambridge.
//		transactions.stream().filter((transaction)->transaction.getTrader().getCity().equals("Cambridge"))
//			.map(Transaction::getValue)
//			.sorted((a,b)->Integer.compare(a, b))
//			.forEach(element-> System.out.println(element));
		//7th What’s the highest value of all the transactions?
//		Optional<Integer> max = transactions.stream()
//			.map(trans->trans.getValue())
//			.min((a,b)->Integer.compare(a, b));
//		max.ifPresent(System.out::print);
		//8th Find the transaction with the smallest value.
//		Optional<Transaction> lowest = transactions.stream()
//								.min((a,b)->Integer.compare(a.getValue(), b.getValue()));
//		lowest.ifPresent((thiss)->System.out.println(thiss.toString()));
		//8th v2 
		
		int[] numbers={1,2,5,7};
		int sum = Arrays.stream(numbers).sum();
		System.out.println(sum);
	}

}
