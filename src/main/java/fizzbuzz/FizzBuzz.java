//This example is based on _Java Examples in a Nutshell_. (http://www.oreilly.com)
//Copyright (c) 1997 by David Flanagan

package fizzbuzz;


public class FizzBuzz {

	private RuleContainer ruleContainer;

	public FizzBuzz(){
		ruleContainer = new RuleContainer();
		ruleContainer.addCondition(new ModuloCondition(5), "Fizz");
		ruleContainer.addCondition(new ModuloCondition(7), "Buzz");
	}

	public String translate(int number) {
		return Translator.translate(number, ruleContainer);
	}
}