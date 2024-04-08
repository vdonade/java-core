package com.learning.core.day4sesion1;


	class Stack {
	    int top;
	    int[] arr;
	    int maxsize;

	    // Initialize stack
	    Stack(int size) {
	        maxsize = size;
	        arr = new int[maxsize];
	        top = -1;
	    }

	    // Check if the stack is empty
	    boolean isEmpty() {
	        return top < 0;
	    }

	    // Push element onto the stack
	    boolean push(int data) {
	        if (top == maxsize - 1) {
	            System.out.println("Overflow!");
	            return false;
	        }
	        arr[++top] = data;
	        return true;
	    }

	    // Pop element from the stack
	    int pop() {
	        if (isEmpty()) {
	            System.out.println("Underflow!");
	            return -1;
	        }
	        return arr[top--];
	    }
	}

	public class D04P09_1 {
	    public static void main(String[] args) {
	        Stack stk = new Stack(5);

	        stk.push(1);
	        stk.push(2);
	        stk.push(3);
	        stk.push(4);

	        System.out.println("After Pushing 4 Elements:");
	        printStack(stk);

	        stk.pop();
	        System.out.println("After a Pop:");
	        printStack(stk);
	    }

	    static void printStack(Stack stk) {
	        while (!stk.isEmpty()) {
	            System.out.print(stk.pop() + " ");
	        }
	        System.out.println();
	    }
	}