package fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	private BuzzwordProvider provider;
	private BuzzerFilter filter;
	private BuzzerTranslator translator;

	@BeforeEach
	void setUp(){
		provider = new BuzzwordProviderImpl();
		filter = new BuzzerFilterImpl();
		translator = new BuzzerTranslatorImpl();
	}

	@Test
	public void Fizz() {
		FizzBuzz fizzer = new FizzBuzz(provider, filter, translator);
		String result = fizzer.translate(15);
		assertEquals("Fizz", result);
	}
	
	@Test
	public void Buzz() {
		FizzBuzz buzzer = new FizzBuzz(provider, filter, translator);
		String result = buzzer.translate(14);
		assertEquals("Buzz", result);
	}
	
	@Test
	public void FizzBuzz() {
		FizzBuzz fizzbuzzer = new FizzBuzz(provider, filter, translator);
		String result = fizzbuzzer.translate(35);
		assertEquals("FizzBuzz", result);
	}
	
	@Test
	public void RandomNumber() {
		FizzBuzz rand = new FizzBuzz(provider, filter, translator);
		String result = rand.translate(4);
		assertEquals("4", result);
	}
}
