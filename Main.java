import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          String[] ticketCost = {"Adult: $20","Child: 15","Senior: $12"}; 
            
          Movie theGodFather = new Movie("The Godfather", "Action", "R", "2:30PM");

          Movie theJoker = new Movie("The Joker", "Thriller", "R", "9:00AM");

          Movie flyMeToTheMoon = new Movie("Fly Me to the Moon", "Comedy", "PG-13", "6:00PM");

          Movie theWildRobot = new Movie("The Wild Robot", "Adventure", "PG", "10:00PM");
      
        System.out.println("Welcome to the Regal Movie Theater. I am Regal Eagle, your personal assistant. I can help you with the following items: Showtimes for today, prices, location. To start, simply type in a question about items!");

        while (true) {
            System.out.print("\nYou: ");
            String input = scanner.nextLine().toLowerCase();

          
            if (input.contains("showtimes") || input.contains("time") ||input.contains("tine")||input.contains("showtime")||input.contains("recommend")||input.contains("movies")||input.contains("movie")){
                getPreference();
            } else if (input.contains("price") || input.contains("cost") || input.contains("ticket")) {
              for(int i = 0; i<ticketCost.length; i++){
                System.out.println(ticketCost[i]);
              }
            } 
            else if(input.contains("action")||input.contains("Action")){
              theGodFather.displayMovieInfo();
              }
             else if(input.contains("thriller")||input.contains("Thriller")){
                theJoker.displayMovieInfo();
                }
             else if(input.contains("Comedy")||input.contains("comedy")){
                flyMeToTheMoon.displayMovieInfo();
                }
             else if(input.contains("Adventure")||input.contains("adventure")){
                theWildRobot.displayMovieInfo();
                }
             else if (input.contains("location") || input.contains("where")) {
              showLocation();
            } else if (input.contains("EXIT") || input.contains("bye") || input.contains("goodbye") || input.contains("exit")) {
                System.out.println("Thank you! Enjoy your next movie!");
                break;
            } 
            else {
                confuseMessage();
            }
          
        }

        scanner.close();
    }

public static void confuseMessage(){
  String[] confuse = {"Im sorry I didn't understand that. Please ask about showtimes, ticket prices, or the location of the theater! Type EXIT to exit the chat session.", "I don't quite understand. Please ask about showtimes ticket prices or location. Type EXIT to exit the chat session.", "I'm not familiar with that. Please ask about showtimes ticket prices or location. Type EXIT to exit the chat session."};
int i = (int)(Math.random()*3);
  System.out.println(confuse[i]);
}

    public static void getPreference() {
      System.out.println("Would you like to see Action, Thriller, Comedy, or Action?");
    }

    public static void showLocation() {
        System.out.println("Our theater is located at 5000 Dublin Blvd, Dublin, CA 94568. We look forward to seeing you!");
      System.out.println("Would you like to know anything else?\nType EXIT to exit the chat session.");
    }
}
