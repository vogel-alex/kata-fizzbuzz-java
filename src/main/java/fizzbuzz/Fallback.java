package fizzbuzz;

public class Fallback implements Mutator {
	@Override
	public String mutate(int number, String prev) {
		if (prev == null || prev.isBlank()) {
			return String.valueOf(number);
		}
		return prev;
	}
}