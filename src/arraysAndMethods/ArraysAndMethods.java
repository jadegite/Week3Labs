package arraysAndMethods;

public class ArraysAndMethods {

	public static void main(String[] args) {
		//create an array with the following values 1, 5, 2, 8, 13, 6
		int[] numArray = {1, 5, 2, 8, 13, 6};
		
		//print out the first element in the array
		System.out.println(numArray[0]);
		
		//print out the last element in the array without using the number 5
		System.out.println(numArray[numArray.length - 1]);
		
		//print out the element in the array at position 6. what happens?
		System.out.println(numArray[6]);
		
		//print out the element in the array at position -1. what happens?
		System.out.println(numArray[-1]);
		
		//write a traditional for loop that prints out each element in the array
		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
		//write an enhanced for loop that prints out each element in the array
		for (int num : numArray) {
			System.out.println(numArray[num]);
		}
		
		//create a new variable called sum, write a loop that adds each element in the array to the sum.
		int sum = 0;
		for (int num : numArray) {
			sum += num;
			System.out.println(sum);
		}
		
		//create a new variable called average and assign the average value of the array to it
		double averageOfArray = sum / numArray.length;
		
		//write an enhanced for loop that prints out each number in the array only if the number is odd
		for (int num : numArray) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}
		
		//create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		//calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		
		//write and test a method that takes a String name and prints out a greeting, this method returns nothing
		greetUser("Tom");
		greetUser("Sally");
		
		//write and test a method that takes a String name and returns a greeting, do not print in the method
		String greeting = greetUser2("Nick");
		System.out.println(greeting);
		
		//analyze the difference between these two methods - what do you find? How are they different?
		
		//write and test a method that takes a String and an int and returns true if the number of letters in the string is greater than the int
		System.out.println(isStringLongerThanNumber("Hello", 3));
		//write and test a method that takes an array of string and a string and returns true if the string passed in exists in the array
		System.out.println(doesArrayContainString(names, "Sam"));
		
		//write and test a method that takes an array of int and returns the smallest number in the array
		System.out.println(findSmallestNumber(numArray));
		//write and test a method that takes an array of double and returns the average
		double[] doubles = {45.7, 30.2, 67.3};
		System.out.println(calculateAverage(doubles));
		//write and test a method that takes an array of Strings and returns an array of int where each element
		//matches the length of the string at that position
		int[] nameLengths = extractStringLengths(names);
		for (int number : nameLengths) {
			System.out.println(number);
		}
		
		//write and test a method that takes an array of strings and returns true if the sum of letters for all strings with an 
		//even amount of letters is greater than the sum of those with an odd amount of letters.
		System.out.println(hasMoreEvenWordCharacters(names));
		
		//write and test a method that takes a string and returns true if the string is a palindrome
		System.out.println(isPalindrome("racecar"));
	}
	
	//write and test a method that takes a String name and prints out a greeting, this method returns nothing
	public static void greetUser (String name) {
		System.out.println("Hello " + name);
	}
	
	//write and test a method that takes a String name and returns a greeting, do not print in the method
	
	public static String greetUser2 (String name) {
		return "Hi, " + name + "!";
	}
	
	public static boolean isStringLongerThanNumber(String string, int number) {
		return string.length() > number;
	}
	
	public static boolean doesArrayContainString(String[] array, String string) {
		for (String str : array) {
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	
	public static int findSmallestNumber(int[] numbers) {
		int smallest = numbers[0];
		for (int number : numbers) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	
	public static double calculateAverage(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	public static int[] extractStringLengths(String[] strings) {
		int[] results = new int[strings.length];
		for (int i = 0; i < strings.length; i++) {
			results[i] = strings[i].length();
		}
		return results;
	}
	
	public static boolean hasMoreEvenWordCharacters(String[] array) {
		int evenLetters = 0;
		int oddLetters = 0;
		
		for (String string : array) {
			if (string.length() % 2 == 0) {
				evenLetters += string.length();
			} else {
				oddLetters += string.length();
			}
		}
		
		return evenLetters > oddLetters;
	}
	
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
