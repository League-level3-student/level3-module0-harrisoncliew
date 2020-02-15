package _00_IntroToArrays;



import java.lang.reflect.Array;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"elem1", "elem2" , "elem3", "elem4", "elem5"};

		//2. print the third element in the array
		System.out.println(array[2]);

		//3. set the third element to a different value
		array[2] = "changed";

		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < array.length; i++) {
			array[i] = "hello";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		//7. make an array of 50 integers
		Integer[] intarray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,14, 25, 26, 227, 28, 29, 450, 10, 20 ,30, 24, 25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
		

		//8. use a for loop to make every value of the integer array a random number
		Random r = new Random();
		for (int i = 0; i < intarray.length; i++) {
			intarray[i] = r.nextInt(101);
		}

		//9. without printing the entire array, print only the smallest number on the array
		int smallest = intarray[0];
		for (int i = 0; i < intarray.length; i++) {
			if(intarray[i]<smallest) {
				smallest=intarray[i];
			}
		}
		System.out.println("Smallest Number: "+smallest);

		//10 print the entire array to see if step 8 was correct
		for (int i = 0; i < intarray.length; i++) {
			System.out.println(intarray[i]);
		}


		//11. print the largest number in the array.
		int largest = intarray[0];
		for (int i = 0; i < intarray.length; i++) {
			if(intarray[i]>largest) {
				largest=intarray[i];
			}
		}
		System.out.println("Largest Number: "+largest);
		//12. print only the last element in the array
		System.out.println(intarray[49]);
	}
}
