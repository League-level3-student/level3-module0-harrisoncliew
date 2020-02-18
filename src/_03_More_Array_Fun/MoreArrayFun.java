package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] tester = {"hello", "goodbye", "a", "expo", "yeet", "ok", "germ"};
		method1(tester);
		method2(tester);
		method3(tester);
		method4(tester);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void method1(String[] word) {
		for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void method2(String[] word) {
		for (int i = word.length-1; i > 0; i--) {
			System.out.println(word[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void method3(String[] word) {
		for (int i = 0; i < word.length; i+=2) {
			System.out.println(word[i]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void method4(String[] word) {
		Random r = new Random();
		boolean[] visited;
		visited = new boolean[word.length];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}
		for (int i = 0; i < word.length; i++) {
			int randomIndex = r.nextInt(word.length);
			if(!visited[randomIndex]) {
				visited[randomIndex] = true;
				System.out.println(word[i]);
			} else {
				--i;
			}
		}
	}
	
}
