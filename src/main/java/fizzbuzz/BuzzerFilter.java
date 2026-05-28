package fizzbuzz;

import java.util.List;

public interface BuzzerFilter {

    List<Buzzword> filter(int number, List<BuzzerAndChecker> buzzwords);

}
