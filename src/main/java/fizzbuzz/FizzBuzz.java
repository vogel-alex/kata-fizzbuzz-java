//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.List;

public class FizzBuzz {

	private BuzzwordProvider provider; 
	private BuzzerFilter filter;
	private BuzzerTranslator translator;

	public FizzBuzz(BuzzwordProvider provider, BuzzerFilter filter, BuzzerTranslator translator) {
		this.provider = provider;
		this.filter = filter;
		this.translator = translator;
	}

	public String translate(int number) {
		List<BuzzerAndChecker> buzzwords = provider.getBuzzwords();
		List<Buzzword> matches = filter.filter(number, buzzwords);
		return translator.translate(number, matches);
	}
}