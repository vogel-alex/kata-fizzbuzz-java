package fizzbuzz;

public class Contains3Calculator implements WordCalculator{
    @Override
    public void calculate(FizzBuzzNumber fbNumber) {
        
        String numberString = String.valueOf(fbNumber.getNumber());

        if (numberString.contains("3")) {
            fbNumber.appendWord("Bar");
        }
    }
}
