package me.brunosantana.steps;

import java.util.List;
import java.util.Map;

import me.brunosantana.model.Response;

public class CalculatorEngine implements Step {
	
	private List<Step> steps;

	@Override
	public Response execute(Map<String, Object> map) {
		System.out.println("Calculator Engine");
		Response response = new Response("campo1");
		Step nextStep = steps.get(0);
		nextStep.setResponse(response);
		return nextStep.execute(map);
	}

	@Override
	public void setPossibleNextSteps(List<Step> steps) {
		this.steps = steps;
		
	}

	@Override
	public void setResponse(Response response) {
		throw new RuntimeException("Does not make sense a response here");		
	}

}
