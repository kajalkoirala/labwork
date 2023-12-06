package exc_lab;


public class Menu{
    public void displayMenuOption(int opt) throws InvalidOptionException {
        if (opt < 1 || opt > 3) {
        	 System.out.println("Menu option " + opt + " selected");
        } 
        
        else {
            System.out.println("Invalid option selected");
            throw new InvalidOptionException("Invalid option is selected");
        }
    }
}
