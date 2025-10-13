package fizzbuzz;

public class Mod7Calculator implements WordCalculator{

    @Override
    public void calculate(FizzBuzzNumber fbNumber) {
        if ((fbNumber.getNumber() % 7) == 0 ) {
            fbNumber.appendWord("Buzz");
        }
    }
    
}