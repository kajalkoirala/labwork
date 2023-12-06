package collection;

import java.util.Stack;

/**
 * The NumberSorter class uses a sorting algorithm based on a provided flow chart
 * to sort an array of integers using two stacks.
 *
 * This implementation employs two stacks, srcStack for input and destStack for output,
 * and iteratively transfers elements between them until the input is sorted in ascending order.
 *
 * The algorithm works by popping elements from srcStack and appropriately placing them
 * in destStack based on their values, adhering to the conditions specified in the flow chart.
 * The sorted order is finally printed.
 *
 * @author kajal
 */
public class NumberSorter {

    /**
     * Sorts an array of integers using two stacks.
     *
     * @param numbers The array of integers to be sorted.
     */
    public void sort(int[] numbers) {
        // The source stack, from which the numbers are popped
        Stack<Integer> srcStack = new Stack<>();
        // The dest stack, to which the numbers are pushed
        Stack<Integer> destStack = new Stack<>();
        int next;

        // Push all numbers into srcStack
        for (int number : numbers) {
            srcStack.push(number);
        }

        // Outer loop
        while (true) {
            // Print all numbers on destStack when srcStack is empty
            if (srcStack.isEmpty()) {
                for (int destSt : destStack) {
                    System.out.println(destSt);
                }
                break;
            } else {
                next = srcStack.pop();
            }

            // Inner loop
            while (true) {
                // Move elements from destStack to srcStack until destStack is empty or the top is greater than current
                if (!destStack.isEmpty() && destStack.peek() > next) {
                    srcStack.push(destStack.pop());
                } else {
                    // Push current to destStack
                    destStack.push(next);
                    break; // Terminate the inner loop
                }
            }
        }
    }
}

