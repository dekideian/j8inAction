package j8.Chapter3Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {   
    	 System.out.println(processFile());
    }
    public static String processFile() throws FileNotFoundException, IOException{
    	String result="";
    	try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
    		result=br.readLine();
    	}
    	return result;
    }
    
    Comparator<Apple> byWeight = new Comparator<Apple>() {
    	public int compare(Apple a1, Apple a2){
    		return a1.getWeight().compareTo(a2.getWeight());
    	}
    };
    Comparator<Apple> byWeight2 = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
}
class Apple{
	Integer weight;

	public Integer getWeight() {
		return weight;
	}

	Apple(){
		
	}
	Apple(Integer w){
		this.weight=w;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public static void process(Runnable r){
		r.run();
	}
	 
}
