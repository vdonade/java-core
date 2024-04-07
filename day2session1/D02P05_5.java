package com.learning.core.day2session1;
import java.util.*;
public class D02P05_5 {
	public static boolean canFormCircle(String[] strings) {
        Map<Character, List<Character>> adjList = new HashMap<>();
        Map<Character, Integer> inDegree = new HashMap<>();
        Map<Character, Integer> outDegree = new HashMap<>();

        // Initialize adjacency list and degree dictionaries
        for (String string : strings) {
            char firstChar = string.charAt(0);
            char lastChar = string.charAt(string.length() - 1);

            adjList.putIfAbsent(firstChar, new ArrayList<>());
            adjList.putIfAbsent(lastChar, new ArrayList<>());
            inDegree.put(firstChar, inDegree.getOrDefault(firstChar, 0));
            inDegree.put(lastChar, inDegree.getOrDefault(lastChar, 0));
            outDegree.put(firstChar, outDegree.getOrDefault(firstChar, 0));
            outDegree.put(lastChar, outDegree.getOrDefault(lastChar, 0));

            adjList.get(firstChar).add(lastChar);
            outDegree.put(firstChar, outDegree.get(firstChar) + 1);
            inDegree.put(lastChar, inDegree.get(lastChar) + 1);
        }

        // Check if there are any characters with unequal in-degree and out-degree
        for (char c : adjList.keySet()) {
            if (!inDegree.get(c).equals(outDegree.get(c))) {
                return false;
            }
        }

        // Function to perform depth-first search
        Set<Character> visited = new HashSet<>();
        dfs(strings[0].charAt(0), adjList, visited);

        // Check if all characters are visited
        return visited.size() == adjList.size();
    }

    private static void dfs(char node, Map<Character, List<Character>> adjList, Set<Character> visited) {
        visited.add(node);
        for (char neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, adjList, visited);
            }
        }
    }

    public static void main(String[] args) {
        String[] input1 = {"Java", "Han", "Mastery", "You", "atta", "atta", "you"};
        String[] input2 = {"abc", "efg", "cde", "ghi", "ija"};
        String[] input3 = {"Ijk", "kji", "abc", "cba"};

        System.out.println("Output for input 1: " + (canFormCircle(input1) ? "Yes" : "No"));
        System.out.println("Output for input 2: " + (canFormCircle(input2) ? "Yes" : "No"));
        System.out.println("Output for input 3: " + (canFormCircle(input3) ? "Yes" : "No"));
    }

}