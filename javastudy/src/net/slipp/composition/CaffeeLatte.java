package net.slipp.composition;

import java.util.Arrays;
import java.util.List;

public class CaffeeLatte implements CaffeineBeverage {
	private WaterHeater heater = new WaterHeater();
	
	private MakeRule makeRule = new Coffee();
	
	private List<CondimentRule> condimentRules = Arrays.asList(new MilkCondiment(), new SugarCondiment()); 
	
	
	@Override
	public void prepareRecipe() {
		heater.boilWater();
		makeRule.brew();
		heater.pourInCup();
		for (CondimentRule condimentRule : condimentRules) {
			condimentRule.addCondiments();
		}
	}
	
	public static void main(String[] args) {
		CaffeeLatte latte = new CaffeeLatte();
		latte.prepareRecipe();
	}
}
