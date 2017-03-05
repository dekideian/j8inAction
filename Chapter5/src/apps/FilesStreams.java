package apps;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FilesStreams {

	public static void main(String[] args) {
		String path = "c://work//asdf.txt";
		long uniqueWords = 0;
		try(Stream<String> lines = Files.lines(Paths.get(path))){
			
			long count = lines.flatMap(linie-> Arrays.stream(linie.split(" ")))
			.distinct().count();
			System.out.println("Count:"+count);
			
		}catch(Exception e){
			System.out.println("File not found most likely: "+e);
		}
	}

	private static URL realPath(String path) {
		return new FilesStreams().getClass().getClassLoader().getResource(path);
	}
}
