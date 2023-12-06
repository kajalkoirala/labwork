package collection;

public class DriverClass {
	public static void main(String[] args){
        NameManager manager = new NameManager();
        manager.addName("M.Mickleson");
        manager.addName ("Johnua Taylor Biggs");
        manager.addName ("P.Smith");
        manager.addName ("Peter Jonathan Smythton");
        manager.addName ("P.Thompson");
        manager.printNames(); // should print all names
        System.out.println("\n"+"Long Names Removed"+"\n");
        manager.removeLongNames();
        manager.printNames(); // should now have longer names removed
    }

}
