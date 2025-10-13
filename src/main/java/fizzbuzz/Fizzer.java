package fizzbuzz;

public class Fizzer implements Mutator {
	@Override
	public String mutate(int number, String prev) {
		if (number % 5 == 0) {
			return prev + "Fizz";
		}
		return prev;
	}
}