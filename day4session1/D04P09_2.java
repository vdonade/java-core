package com.learning.core.day4sesion1;



class Node {
	  int data;
	  Node next;

	  public Node(int data) {
	    this.data = data;
	  }
	}

	class Stack {
	  Node top;

	  public boolean isEmpty() {
	    return top == null;
	  }

	  public void push(int data) {
	    Node newNode = new Node(data);
	    newNode.next = top;
	    top = newNode;
	  }

	  public int pop() {
	    if (isEmpty()) {
	      System.out.println("Stack is empty");
	      return -1;
	    }
	    int data = top.data;
	    top = top.next;
	    return data;
	  }

	  public int peek() {
	    if (isEmpty()) {
	      System.out.println("Stack is empty");
	      return -1;
	    }
	    return top.data;
	  }
	}

	public class D04P09_2 {
	  public static void main(String[] args) {
	    Stack stack = new Stack();

	    stack.push(10);
	    stack.push(20);
	    stack.push(30);
	    stack.push(40);

	    System.out.println("Elements in Stack: ");
	    printStack(stack);

	    stack.pop();
	    stack.pop();

	    System.out.println("\nElements in Stack after popping twice: ");
	    printStack(stack);
	  }

	  public static void printStack(Stack stack) {
	    Node temp = stack.top;
	    while (temp != null) {
	      System.out.print(temp.data + " ");
	      temp = temp.next;
	    }
	    System.out.println();
	  }
	}