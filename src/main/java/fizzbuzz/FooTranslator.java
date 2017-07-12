package fizzbuzz;

public class FooTranslator implements Translator{

	@Override
	public String translate(int number) {
		if ((number % 6) == 0 || (number % 7) == 0) {
			return "Foo";
		}
		return EMPTY;
	}
}
