package fizzbuzz;

public class BuzzerCheckerRemainder implements BuzzerChecker {

    @Override
    public boolean check(int number, Buzzword buzzword) {
        for (var buzzwordNumber : buzzword.numbers()) {
            if (number % buzzwordNumber == 0) return true;
        }
        return false;
    }
    
}
