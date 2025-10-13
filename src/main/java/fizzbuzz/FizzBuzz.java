//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;

import java.util.*;;

public class FizzBuzz {

	private final List<Mutator> mutators = new ArrayList<>();

	public FizzBuzz() {
		this(List.of(new Fizzer(), new Buzzer()));
	}

	public FizzBuzz(List<Mutator> mutators) {
		mutators.addAll(mutators);
		mutators.add(new Fallback());
	}

	public String translate(int number) {
		String result = "";
		for (var mutator : mutators) {
			result = mutator.mutate(number, result);
		}
		return result;
	}

}