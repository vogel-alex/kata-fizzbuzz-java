package fizzbuzz;

public class BuzzerCheckerContainsDigit implements BuzzerChecker{

    @Override
    public boolean check(int number, Buzzword buzzword) {
        String numberString = Integer.toString(number);
        for (var buzzwordNumber : buzzword.number()) {
            if (numberString.contains(Integer.toString(buzzwordNumber))) 
                return true;
        }
        return false;
    }
    
}
