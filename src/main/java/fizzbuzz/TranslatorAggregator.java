package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;

public class TranslatorAggregator {
	private List<Translator> translators;
	
	TranslatorAggregator(List<Translator> translators){
		this.translators = translators;
	}

	public String translate(int number) {
		var translated = translators.stream()
			.map(t -> t.translate(number))
			.collect(Collectors.joining());

		if ("".equals(translated)) {
			return String.valueOf(number);
		}
		return translated;
	}
}
