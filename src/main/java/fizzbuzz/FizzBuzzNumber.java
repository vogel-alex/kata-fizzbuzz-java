package fizzbuzz;

public class FizzBuzzNumber {
    int number;
    String word = "";

    public FizzBuzzNumber(int number) {
        this.number = number;
    }

    public void appendWord(String word) {
        this.word += word;
    }

    public int getNumber() {
        return this.number;
    }

    public String getResult() {
        if (word.isEmpty()) {
            return String.valueOf(number);
        }
        return word;
    }
}
