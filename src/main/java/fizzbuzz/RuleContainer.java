package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class RuleContainer {

    private List<Rule> rules = new ArrayList<>();

	public record Rule(ICondition condition, String output) {

	}

	public void addCondition(ICondition condition, String output){
		rules.add(new Rule(condition, output));
	}

    public List<Rule> getRules(){
        return rules;
    }
    
}
