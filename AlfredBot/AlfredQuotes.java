import java.util.Date;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String timeOfDay, String name) {
        // YOUR CODE HERE
        return String.format("Good %s %s, welcome to the party", timeOfDay, name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("Today's date is %s, ", new Date());
    }
    
    public String respondBeforeAlexis(String conversataion) {
        // YOUR CODE HERE
        if(conversataion.indexOf("Alexis") > -1) {
            return "I'm not a fan of Alexis!";
        }
        
        if(conversataion.indexOf("Alfred") > -1) {
            return "Alfred is Amazing. Always willing to help!";
        }
        
        else {
            return "Maybe that's what Batman is about. Not winning. But failing..";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

