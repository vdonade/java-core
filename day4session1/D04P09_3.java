package com.learning.core.day4sesion1;
import java.util.Stack;

public class D04P09_3 {

    public static int evaluate(String expression, int i) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                int val = 0;
                while (Character.isDigit(c)) {
                    val = val * 10 + (c - '0');
                    c = expression.charAt(++i);
                }
                values.push(val);
            } else if (c == '(') {
                ops.push(c);
            } else if (c == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.pop();
            } else if (isOperator(c)) {
                while (!ops.isEmpty() && hasPrecedence(ops.peek(), c)) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(c);
            }
        }

        while (!ops.isEmpty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static boolean hasPrecedence(char op1, char op2) {
        switch (op1) {
            case '+':
            case '-':
                return true;
            case '*':
            case '/':
                return op2 != '+' && op2 != '-';
        }
        return false;
    }

    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Division by zero");
                }
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(evaluate("10 + 2 * 6", 0)); // Output: 22
        System.out.println(evaluate("100 * (2 + 12)", 0)); // Output: 1400
    }
}