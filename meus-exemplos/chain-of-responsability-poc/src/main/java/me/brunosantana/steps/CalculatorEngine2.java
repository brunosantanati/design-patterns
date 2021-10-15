package me.brunosantana.steps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import me.brunosantana.model.Response;

public class CalculatorEngine2 implements Step {
	
	private List<Step> steps;
	private Response response;

	@Override
	public Response execute(Map<String, Object> map) {
		System.out.println("Calculator Engine 2");
		
		String campo2Calculado = "campo2Calculado";
		this.response.setCampo2(campo2Calculado);
		
		Map<String, Object> itens = new HashMap<>();
		itens.put("campo2Calculado", campo2Calculado);
		
		Step nextStep = steps.get(0);
		nextStep.setResponse(response);
		return nextStep.execute(itens);
	}

	@Override
	public void setPossibleNextSteps(List<Step> steps) {
		this.steps = steps;
		
	}

	@Override
	public void setResponse(Response response) {
		this.response = response;
	}

}
