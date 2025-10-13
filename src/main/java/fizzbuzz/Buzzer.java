package fizzbuzz;

public class Buzzer implements Mutator {
	@Override
	public String mutate(int number, String prev) {
		if (number % 7 == 0) {
			return prev + "Buzz";
		}
		return prev;
	}
}