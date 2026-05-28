package fizzbuzz;

public class BuzzerCheckerRemainder implements BuzzerChecker {

    @Override
    public boolean check(int number, Buzzword buzzword) {
        for (var buzzwordNumber : buzzword.number()) {
            if (number % buzzwordNumber == 0) return true;
        }
        return false;
    }
    
}
