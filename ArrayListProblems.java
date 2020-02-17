import java.util.ArrayList;

/********************************
 * ArrayListProblems
 * Marco Gonzalez
 * 02-01-2018
 ********************************/
public class ArrayListProblems {
	public static void main(String[] args){
		// 1
		System.out.println("TEST #1");
		// TEST string ArrayList and elements
		ArrayList<String > words = new ArrayList<String>(30);
		words.add("cat");
		words.add("mat");
		words.add("stone");
		words.add("car");
		words.add("gauntlet");
		
		// the for loop finds the length of each element and then uses an if-else statement to see if the length of the element(s) requires it to be removed from the ArrayList
		for (int i = 0; i < words.size(); i++){
			int length = words.get(i).length();
			if (length <= 5){
				System.out.println(words.get(i));
			}
			else {
				System.out.println();
			}
		}
		
		// 2
		System.out.println("TEST #2");
		// TEST integers ArrayList and elements
		ArrayList<Integer> nums = new ArrayList<Integer>(30);
		nums.add(3);
		nums.add(-5);
		nums.add(10);
		nums.add(-10);
		nums.add(13);
		
		// the for loop uses an if-else statement  in order to only display integers less than zero and to count how many negative integers are in the ArrayList
		int count = 0;
		for (int i = 0; i < nums.size(); i++){
			if (nums.get(i) < 0) {
				System.out.println(nums.get(i));
				count = count + 1;
			}
			else {
				System.out.println();
			}
		}
		System.out.println("Number of negative integers in the ArrayList is: " + count);
		
	}

}
