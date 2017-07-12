package fizzbuzz;

public class BuzzTranslator implements Translator {

	@Override
	public String translate(int number) {
		if ((number % 7) == 0) {
			return "Buzz";
		}
		return EMPTY;
	}
}
