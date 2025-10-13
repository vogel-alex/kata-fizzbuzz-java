//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.List;

public class FizzBuzz {

	private final List<WordCalculator> calculators = List.of(new Mod6Or7Calculator(), new Mod5Calculator(), new Contains3Calculator(), new Mod7Calculator());

	public String translate(int number) {
		FizzBuzzNumber fbNumber = new FizzBuzzNumber(number);
		calculators.stream().forEach(x -> x.calculate(fbNumber));
		return fbNumber.getResult();
	}
}