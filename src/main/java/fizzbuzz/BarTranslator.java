package fizzbuzz;

public class BarTranslator implements Translator {

	@Override
	public String translate(int number) {
		if (has3inIt(number)) {
			return "Bar";
		}
		return EMPTY;
	}
	
	private boolean has3inIt(int number)
	{
		while (number > 0)
		{
			if (number % 10 == 3)
				return true;
			number /= 10;
		}
		return false;
	}
}
