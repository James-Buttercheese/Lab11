import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Movie {
	
	private String name;
	private String genre;
	
	
	
	
	public Movie (String name, String genre) {
		
		this.name = name;
		this.genre = genre;
	
	}
	
	public String toString() {
		
		
		return String.format("%s, %s", name, genre);
	}
	

		
	}

