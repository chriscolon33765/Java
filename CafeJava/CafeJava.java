public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String dripCoffee = "";
        String latte  = "";
        String cappucino = "";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 3.00;
        double lattePrice = 6.75;
        double cappucinoPrice = 5.15;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3  = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder1) {
            System.out.println("Cindhuri" + readyMessage);
        }
        else {
            System.out.println("Cindhuri" + pendingMessage);
        }

        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.println("Noah" + readyMessage + ". " + displayTotalMessage + dripCoffeePrice);
        }
        else {
            System.out.println("Noah" + pendingMessage);
        }

        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2) {
            System.out.println("Sam" + readyMessage + ". " + displayTotalMessage + (lattePrice + lattePrice));
        }
        else {
            System.out.println("Sam" + pendingMessage);
        }

        System.out.println(generalGreeting + customer3);
            System.out.println("Jimmy, your remaining blance is $" + (lattePrice - dripCoffeePrice) +".");
    }
        
}