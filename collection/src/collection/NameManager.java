package collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class manages a list of names and provides methods for adding, printing,
 * and removing names based on specific criteria.
 */
public class NameManager {

    // List to store names
    List<String> names = new ArrayList<>();

    /**
     * Adds a new name to the list.
     *
     * @param name The name to be added.
     */
    public void addName(String name) {
        this.names.add(name);
    }

    /**
     * Prints all names in the list.
     */
    public void printNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    /**
     * Removes names that are longer than 15 characters.
     */
    public void removeLongNames() {
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.length() > 15) {
                iterator.remove();
            }
        }
    }
}
