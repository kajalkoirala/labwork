package exc_lab;

public class Driver {
    public static void main(String[] args) {
        ArrayProcessor ap = new ArrayProcessor();
        int len = ap.getArrayLength(new String[]{"one", "two", "three"});
        System.out.println("Array length is " + len);

        
        
        Menu menu = new Menu();

        try {
            
            menu.displayMenuOption(10);
            menu.displayMenuOption(2);
            menu.displayMenuOption(3);
            menu.displayMenuOption(8);
        }
        
        catch (InvalidOptionException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
