package fizzbuzz;

public class FizzTranslator implements Translator {

	@Override
	public String translate(int number) {
		if ((number % 5) == 0) {
			return "Fizz";
		}
		return EMPTY;
	}
}
