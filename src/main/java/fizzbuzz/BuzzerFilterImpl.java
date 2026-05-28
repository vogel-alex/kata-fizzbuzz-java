package fizzbuzz;

import java.util.List;

public class BuzzerFilterImpl implements BuzzerFilter {

    @Override
    public List<Buzzword> filter(int number, List<BuzzerAndChecker> buzzwords) {
        return buzzwords.stream() //
			.filter(entry -> entry.checker().check(number, entry.buzzword())) //
            .map(entry -> entry.buzzword()) //
			.toList();
    }

}
