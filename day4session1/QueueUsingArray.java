package com.learning.core.day4sesion1;

//  D04P09_4

public class QueueUsingArray {
	    private int capacity;
	    private int[] queueArray;
	    private int front;
	    private int rear;
	    private int size;

	    public QueueUsingArray(int capacity) {
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
	        System.out.print("Elements in queue : ");
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
	        QueueUsingArray queue = new QueueUsingArray(5);
	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);
	        queue.enqueue(40);
	        queue.displayQueue();

	        System.out.println("After removing first element");
	        queue.dequeue();
	        queue.displayQueue();
	    }
	}