import java.util.Scanner;

public class MovieDriver_Task1 {
	public static void main(String[] args) {
		String movieName, rating;
		int tickets;
		
		Scanner scanner = new Scanner(System.in);
		Movie movie = new Movie();
		System.out.println("Enter the name of a movie: ");
		movieName = scanner.nextLine();
		movie.setTitle(movieName);
		System.out.println("Enter the rating of the movie: ");
		rating = scanner.nextLine();
		movie.setRating(rating);;
		System.out.println("Enter the number of tickets sold for this movie: ");
		tickets = scanner.nextInt();
		movie.setSoldTickets(tickets);
		System.out.println(movie.toString());
		System.out.println("Goodbye");
		scanner.close();
		
		
	}
}
