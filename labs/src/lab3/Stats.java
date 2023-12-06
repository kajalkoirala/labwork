package lab3;

import java.util.Arrays;

/**
 * The Stats class stores and computes statistical data for a set of integers.
 */
public class Stats {
    private int[] numbers;
    private int count;

    /**
     * Adds a new value to the collection of numbers.
     *
     * @param value the value to be added
     */
    public void addValue(int value) {
        if (count < numbers.length) {
            numbers[count] = value;
            count++;
        } else {
            System.out.println("Array is full. Cannot add more values.");
        }
    }

    /**
     * Returns the count of elements entered.
     *
     * @return the count of elements entered
     */
    public int getCount() {
        return count;
    }

    /**
     * Retrieves the maximum value in the collection.
     *
     * @return the maximum value in the collection
     */
    public int getMaxValue() {
        int max = numbers[0];

        for (int i = 1; i < count; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }

    /**
     * Retrieves the minimum value in the collection.
     *
     * @return the minimum value in the collection
     */
    public int getMinValue() {
        int min = numbers[0];

        for (int i = 1; i < count; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }

    /**
     * Calculates the total sum of all values in the collection.
     *
     * @return the total sum of all values
     */
    public int getTotal() {
        int total = 0;

        for (int i = 0; i < count; i++) {
            total += numbers[i];
        }
        return total;
    }
    
    /**
     * check the maximum number in collection.
     * @return the maximum number value in the array.
     */
    public int getA() {
        int max = numbers[0];

        for (int i = 1; i < count; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        return max;
    }
    
    /**
     * check the minimum number in the collection. 
     * @return the minimum value of the collection.
     */

    public int getB() {
        int min = numbers[0];

        for (int i = 1; i < count; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        return min;
    }

    /**
     * Computes the average of all values in the collection.
     *
     * @return the average of all values
     */
    public double getAverage() {
        if (count == 0) {
            return 0; // Handle division by zero
        }

        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        return sum / count; // Calculate average
    }

    /**
     * Provides a string representation of the entered numbers.
     *
     * @return a string representation of the entered numbers
     */
    @Override
    public String toString() {
        // Use Arrays.copyOfRange to display only the entered elements, not the entire array
        return Arrays.toString(Arrays.copyOfRange(numbers, 0, count));
    }

    /**
     * Constructs a Stats object with a specified capacity.
     *
     * @param capacity the initial capacity of the Stats object
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
        count = 0; // Initialize count to 0
    }
}
