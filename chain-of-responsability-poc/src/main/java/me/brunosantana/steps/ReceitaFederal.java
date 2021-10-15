package me.brunosantana.steps;

import java.util.List;
import java.util.Map;

import me.brunosantana.model.Response;

public class ReceitaFederal implements Step {
	
	private List<Step> steps;
	private Response response;

	@Override
	public Response execute(Map<String, Object> map) {
		System.out.println("Receita Federal");
		boolean receitaFederalOk = true;
		//boolean receitaFederalOk = false; //simulando pular step
		if(receitaFederalOk) {
			Step nextStep = steps.get(0);
			nextStep.setResponse(response);
			return nextStep.execute(map);
		}else {
			Step nextStep = steps.get(1);
			nextStep.setResponse(response);
			return nextStep.execute(map);
		}
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
