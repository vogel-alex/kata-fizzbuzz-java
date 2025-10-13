package fizzbuzz;

class ModuloCondition implements ICondition {

    private int moduloNumber;

    public ModuloCondition(int moduloNumber) {
        this.moduloNumber = moduloNumber;
    }

    @Override
    public boolean checkCondition(int input) {
        return input % moduloNumber == 0;
    }
}