package fizzbuzz;

import java.util.List;

public class BuzzwordProviderImpl implements BuzzwordProvider {

    private List<BuzzerAndChecker> buzzwords = List.of( //
        new BuzzerAndChecker(new Buzzword(List.of(6, 7), "Foo"), new BuzzerCheckerRemainder()),
		new BuzzerAndChecker(new Buzzword(List.of(5), "Fizz"), new BuzzerCheckerRemainder()), //
        new BuzzerAndChecker(new Buzzword(List.of(3), "Bar"), new BuzzerCheckerContainsDigit()), //
		new BuzzerAndChecker(new Buzzword(List.of(7),  "Buzz"), new BuzzerCheckerRemainder()) //
		);

    @Override
    public List<BuzzerAndChecker> getBuzzwords() {
        return buzzwords;
    }



}
