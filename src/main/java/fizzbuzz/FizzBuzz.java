//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.List;

public class FizzBuzz {

	private TranslatorAggregator aggregator;

	FizzBuzz() {
		var translators = List.of(
			new FooTranslator(),
			new FizzTranslator(),
			new BarTranslator(),
			new BuzzTranslator()
		);
		aggregator = new TranslatorAggregator(translators);
	}

	public String translate(int number) {
		return aggregator.translate(number);
	}
}