package collection.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("Element 1");
        queue.add("Element 2");
        queue.add("Element 3");

        // Using offer to add an element to the queue and checking if it was added successfully
        if (queue.offer("Element 4")) {
            System.out.println("Element 4 was added to the queue");
        }

        // Retrieving the head of the queue without removing it
        System.out.println("Head of queue : " + queue.peek());

        // Displaying the size of the queue
        System.out.println("Queue size: " + queue.size());

        // Removing and displaying elements from the queue until it is empty
        while (!queue.isEmpty()) {
            System.out.println("Removed: " + queue.poll());
        }

        // Checking if the queue is empty and displaying a message
        if (queue.isEmpty()) {
            System.out.println("The queue is now empty");
        }

        // Trying to remove an element from the empty queue and catching the exception
        try {
            queue.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: NoSuchElementException");
        }
    }
}
