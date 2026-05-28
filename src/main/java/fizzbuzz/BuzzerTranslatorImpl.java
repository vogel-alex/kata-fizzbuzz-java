package fizzbuzz;

import java.util.List;
import java.util.stream.Collectors;

public class BuzzerTranslatorImpl implements BuzzerTranslator{

    @Override
    public String translate(int number, List<Buzzword> buzzwords) {
        
        if (buzzwords.isEmpty()) {
            return String.valueOf(number); // else just print it
		}
        return buzzwords.stream() //
            .map(Buzzword::content) //
            .collect(Collectors.joining());
    }

}
