package fizzbuzz;

public class Mod6Or7Calculator implements WordCalculator{

    @Override
    public void calculate(FizzBuzzNumber fbNumber) {
        if ((fbNumber.getNumber() % 7) == 0 ||  (fbNumber.getNumber() % 6) == 0) {
            fbNumber.appendWord("Foo");
        }
    }
    
}