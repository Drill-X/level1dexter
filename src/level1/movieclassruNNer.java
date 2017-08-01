package level1;

public class movieclassruNNer {
	public static void main(String[] args) {
		
	
Movie Movie1 = new Movie("1", 1);
Movie Movie2 = new Movie("2", 2);
Movie Movie3 = new Movie("3", 3);
Movie Movie4 = new Movie("4", 4);
Movie Movie5 = new Movie("5", 5);
System.out.println(Movie1.getTicketPrice());
System.out.println(Movie2.getTicketPrice());	
System.out.println(Movie3.getTicketPrice());	
System.out.println(Movie4.getTicketPrice());	
System.out.println(Movie5.getTicketPrice());	
NetflixQueue queue = new NetflixQueue();
queue.addMovie(Movie1);
queue.addMovie(Movie2);
queue.addMovie(Movie3);
queue.addMovie(Movie4);
queue.addMovie(Movie5);
System.out.println("the best movie is "+ queue.getBestMovie());
System.out.println("the second best movie is "+ queue.getMovie(1));
}
}