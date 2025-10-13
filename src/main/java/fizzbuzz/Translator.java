package fizzbuzz;

public class Translator {

    public static String translate(int number, RuleContainer ruleContainer) {
        String result = "";
        for (var rule : ruleContainer.getRules()) {
            if (rule.condition().checkCondition(number)) {
                result += rule.output();
            }
        }
        if (result.isEmpty()) {
            result = String.valueOf(number);
        }
        return result;
    }
}
