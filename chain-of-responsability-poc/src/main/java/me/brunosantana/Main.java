package me.brunosantana;

import java.util.List;

import me.brunosantana.model.Response;
import me.brunosantana.steps.AuthorizationChecker;
import me.brunosantana.steps.Billing;
import me.brunosantana.steps.CalculatorEngine;
import me.brunosantana.steps.CalculatorEngine2;
import me.brunosantana.steps.Filter;
import me.brunosantana.steps.Logger;
import me.brunosantana.steps.ReceitaFederal;
import me.brunosantana.steps.Step;

public class Main {

	public static void main(String[] args) {
		Step step1Auth = new AuthorizationChecker();
		Step step2Engine = new CalculatorEngine();
		Step step3Filter = new Filter();
		Step step4Receita = new ReceitaFederal();
		Step step5Engine2 = new CalculatorEngine2();
		Step step6Billing = new Billing();
		Step step7Logger = new Logger();
		
		step1Auth.setPossibleNextSteps(List.of(step2Engine));
		step2Engine.setPossibleNextSteps(List.of(step3Filter));
		step3Filter.setPossibleNextSteps(List.of(step4Receita, step6Billing));
		step4Receita.setPossibleNextSteps(List.of(step5Engine2, step6Billing));
		step5Engine2.setPossibleNextSteps(List.of(step6Billing));
		step6Billing.setPossibleNextSteps(List.of(step7Logger));
		
		Response response = step1Auth.execute(null);
		
		System.out.println(response);

	}

}
