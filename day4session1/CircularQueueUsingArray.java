package com.learning.core.day4sesion1;

// D04P09_6

public class CircularQueueUsingArray {
	    private int[] queueArray;
	    private int capacity;
	    private int front;
	    private int rear;
	    private int size;

	    public CircularQueueUsingArray(int capacity) {
	        this.capacity = capacity;
	        this.queueArray = new int[capacity];
	        this.front = 0;
	        this.rear = -1;
	        this.size = 0;
	    }

	    public void enqueue(int item) {
	        if (isFull()) {
	            System.out.println("Queue is full. Cannot enqueue " + item);
	            return;
	        }
	        rear = (rear + 1) % capacity;
	        queueArray[rear] = item;
	        size++;
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty. Cannot dequeue.");
	            return -1;
	        }
	        int removedItem = queueArray[front];
	        front = (front + 1) % capacity;
	        size--;
	        return removedItem;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public boolean isFull() {
	        return size == capacity;
	    }

	    public void displayQueue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return;
	        }
	        System.out.print("Elements in circular queue: ");
	        int count = 0;
	        int index = front;
	        while (count < size) {
	            System.out.print(queueArray[index] + " ");
	            index = (index + 1) % capacity;
	            count++;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        CircularQueueUsingArray queue = new CircularQueueUsingArray(4);
	        queue.enqueue(14);
	        queue.enqueue(13);
	        queue.enqueue(22);
	        queue.enqueue(-8);
	        queue.displayQueue();

	        System.out.println("After removing first element:");
	        queue.dequeue();
	        queue.displayQueue();
	    }
	}