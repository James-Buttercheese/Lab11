import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class MoreMovies {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String response;
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		
		boolean cont = true;
		String contResponse = "";

		for (int i = 1; i <= 100; i++) {
			Movie temp = MovieIO.getMovie(i);

			movieList.add(temp);
		}

		String[] movieArray = movieList.toString().split(",");
		System.out.println(Arrays.toString(movieArray));
		System.out.println(movieArray[1]);

		System.out.printf("%5s %10s \n", "", "Welcome to the Movie List App.");
		System.out.println();
		System.out.println("We have a variety of movie types you can view.");

		while (cont) {

			System.out.printf("%7s %5s", "", "Please select off the menu:\n\n" + menu());

			response = scnr.nextLine();
			if (responseNum(response)) {
				if (response.equals("1")) {
					response = "drama";
				}
				else if (response.equals("2")) {
					response = "musical";
				}
				else if (response.equals("3")) {
					response = "scifi";
				}
				else if (response.equals("4")) {
					response = "comedy";
				}
				else if (response.equals("5")) {
					response = "horror";
				}
				else if (response.equals("6")) {
					response = "animated";
				}
			}
			if (responseType(response)) {
				Set<String> tempSet = new TreeSet<>();
				for (int i = 0; i < 199; i = i + 2) {
					if (movieArray[i + 1].contains(response)) {
						tempSet.add(movieArray[i]);
					}
				}
				Spliterator<String> tempSplit = tempSet.spliterator();
				tempSplit.forEachRemaining(System.out::println);
			} else {
				System.out.println("That is not a valid response.");

			} System.out.println("Would you like to continue? (Yes/No)");
			contResponse = scnr.nextLine();
			if (!contResponse.equalsIgnoreCase("yes")) {
				cont = false;
			
		}
		System.out.println("Goodbye");
		}

	}

	public static String menu() {

		return ("1) Drama \n2) Musical \n3) Scifi \n4) Comedy \n5) Horror \n6) Animated\n");
	}

	public static boolean responseType(String response) {
		if ((response.equalsIgnoreCase("drama")) || (response.equalsIgnoreCase("musical"))
				|| (response.equalsIgnoreCase("scifi")) || (response.equalsIgnoreCase("comedy"))
				|| (response.equalsIgnoreCase("horror")) || (response.equalsIgnoreCase("animated"))) {
			return true;
		}

		return false;
	}

	public static boolean responseNum(String response) {
		if ((response.equals("1")) || (response.equals("2")) || (response.equals("3")) || (response.equals("4"))
				|| (response.equals("5")) || (response.equals("6"))) {
			return true;
		}

		return false;
	}
}
