package dsa;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static List<String> fizzBuzz(int n) {
		List<String> fizzBuzzList = new ArrayList<>();
		String answers[] = { "FizzBuzz", "Buzz", "Fizz", "0" };
		for (int i = 1; i <= n; i++) {
			int index = 3;
			answers[3] = String.valueOf(i);
			if (i % 3 == 0)
				index--;
			if (i % 5 == 0)
				index -= 2;
			fizzBuzzList.add(answers[index]);

		}

		return fizzBuzzList;

	}

	public static void main(String[] args) {
		System.out.println(fizzBuzz(21));

	}

}
