package net.slipp.composition;

import java.util.List;

public class BeverageMaker implements CaffeineBeverage {
	private WaterHeater heater = new WaterHeater();
	
	private MakeRule makeRule;
	
	private List<CondimentRule> condimentRules;
	
	public BeverageMaker(MakeRule makeRule, List<CondimentRule> condimentRules) {
		this.makeRule = makeRule;
		this.condimentRules = condimentRules;
	}
	
	public void prepareRecipe() {
		heater.boilWater();
		makeRule.brew();
		heater.pourInCup();
		for (CondimentRule condimentRule : condimentRules) {
			condimentRule.addCondiments();
		}
	}
}
