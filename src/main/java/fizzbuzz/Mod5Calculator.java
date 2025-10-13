package fizzbuzz;

public class Mod5Calculator implements WordCalculator{

    @Override
    public void calculate(FizzBuzzNumber fbNumber) {
        if ((fbNumber.getNumber() % 5) == 0 ) {
            fbNumber.appendWord("Fizz");
        }
    }
    
}
